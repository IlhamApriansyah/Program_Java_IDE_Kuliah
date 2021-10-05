/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class penggajian {
    private double gajipokok, gajiSetelahPajak, pajakGaji;
    private double gajiBersih;
    private double potongan = 100000;

    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }

    public double getGajipokok() {
        return gajipokok;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }
    
    public void hitungGaji() {
        gajiSetelahPajak = gajipokok - (0.1*gajipokok);
        pajakGaji = (gajipokok * 0.1);
        gajiBersih = gajiSetelahPajak - potongan;
        
        System.out.println("\nBesar pajak gaji :"+pajakGaji);
        System.out.println("\nBesar potongan gaji :"+potongan);
    }
    
}
