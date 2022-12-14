package pbol_project;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class Barang {

    private String namaBarang;
    private double harga;
    private String idBarang;
    private int qty;
    private double totalHarga;

    public Barang() {
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotalHarga() {
        return totalHarga = harga * qty;
    }

    public void setTotalHarga(double harga) {
        this.totalHarga = harga * qty;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }
}
