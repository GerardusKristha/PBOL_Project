package pbol_project;

import java.sql.*;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class Database {

    public Connection getConnection() throws SQLException {
        String host = "localhost";
        String port = "1521";
        String db = "xepdb1";
        String usr = "hr";
        String pwd = "kristhabayu10";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Maaf, driver class tidak ditemukan");
            System.out.println(e.getMessage());
        }
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port + "/" + db, usr, pwd);

        return conn;
    }

    public Barang cariData(Barang cariBarang) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        conn = this.getConnection();
        ResultSet rs = null;
        Barang hasilCari = null;
        String id_barang = cariBarang.getIdBarang();

        try {
            ps = conn.prepareStatement("select * from gudang where id_barang = ?");
            ps.setString(1, id_barang);
            rs = ps.executeQuery();

            while (rs.next()) {
                hasilCari = new Barang();
                hasilCari.setIdBarang(rs.getString(1));
                hasilCari.setNamaBarang(rs.getString(2));
                hasilCari.setHarga(rs.getDouble(3));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return hasilCari;
    }

    public void riwayatTransaksi(String noNota, Timestamp tanggalNota, int jumlahTotal) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        conn = this.getConnection();

        try {
            ps = conn.prepareStatement("insert into transaksi values(?,?,?)");
            ps.setString(1, noNota);
            ps.setTimestamp(2, tanggalNota);
            ps.setDouble(3, jumlahTotal);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
