package pbol_project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class Nota {

    private LinkedList<Barang> dataBarang;
    private int idNota;

    public Nota() {
        dataBarang = new LinkedList<Barang>();
    }

    public void inptDataBarang(Barang daftarBarang) {
        dataBarang.add(daftarBarang);
    }

    public void hapusDataBarang(){
        dataBarang.removeAll(dataBarang);
    }
    public void cetakNota(String tanggal, String noNota, Barang hasil) {
        try {
            File fileStruk = new File("Struk"+noNota+".txt");
            if (!fileStruk.exists()) {
                fileStruk.createNewFile();
            }
            FileWriter output = new FileWriter(fileStruk.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(output);
            String StrukOutput = "----------NOTA PEMBELIAN----------\n"
                    + "Tanggal Transaksi : " + tanggal + "\n"
                    + "No Nota : " + noNota + "\n"
                    + "----------------------------------\n"
                    + "Nama Barang\t\t\t\tHarga barang\t\tQty\t\tTotal Harga\n";

            for (int i = 0; i < dataBarang.size(); i++) {
                Barang temp = dataBarang.get(i);
                StrukOutput += "\n" + temp.getNamaBarang() + "\t\t\t\t" + temp.getHarga() + "\t\t\t" + temp.getQty() + "\t\t\t" + temp.getTotalHarga() + "\n";
            }
            bw.write(StrukOutput);
            bw.close();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
