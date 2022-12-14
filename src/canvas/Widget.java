package canvas;

import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class Widget extends JFrame {

    private static final int FRAME_WIDTH = 1280;
    private static final int FRAME_HEIGHT = 720;
    
    private JLabel labelNoNota,labelTanggal,labelCariBarang,labelNamaBarang,
            labelJumlah1,labelJumlah2,labelHargaBarang,labelOpsi,labeltotal,
            labelBayar,labelKembali;
    private JTextField tfNoNota,tfTanggal,tfCariBarang,tfJumlah,tfBayar,tfKembali,tfTotal;
    private JButton buttonInputBarang, buttonHapus,buttonSelesai,buttonBatal;
    private JTextArea taNamaBarang,taJumlah,taHargaBarang;
    
    public Widget() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Aplikasi Kasir"  );
        
        labelNoNota = new JLabel("No Nota : ");
        contentPane.add(labelNoNota);
        
        labelTanggal = new JLabel("Tanggal : ");
        contentPane.add(labelTanggal);
        
        labelCariBarang = new JLabel("Cari barang : ");
        contentPane.add(labelCariBarang);
        
        labelJumlah1 = new JLabel("Jumlah : ");
        contentPane.add(labelJumlah1);
        
        labelNamaBarang = new JLabel("Nama Barang");
        contentPane.add(labelNamaBarang);
        
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

}
