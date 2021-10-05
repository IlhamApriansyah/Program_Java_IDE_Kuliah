
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class EnkapsulasiGaji {
    public static void main (String [] args){
        
        penggajian pegawai = new penggajian();
        double sg;
        String nilai;
        
        nilai = JOptionPane.showInputDialog("Masukkan Gaji Anda :");
        
        sg = Double.parseDouble(nilai);
        
        pegawai.setGajipokok(sg);
        pegawai.hitungGaji();
        System.out.println("\nBesar Gaji Bersih : "+pegawai.getGajiBersih());
    }
}
