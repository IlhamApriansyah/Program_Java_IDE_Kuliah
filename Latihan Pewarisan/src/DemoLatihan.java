/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DemoLatihan {
    public static void main(String []args){
        LuasLingkaran a = new LuasLingkaran();
        
        a.setKonstanta(3.14);
        a.setJari(14);
        
        System.out.println("");
        System.out.println("\t Program Rumus Luas Lingkaran");
        System.out.println("");
        System.out.println("Lingkaran dengan Jejari : "+a.getJari());
        System.out.println("R Luas nya adalah\t: "+a.Luas());
        System.out.println("");
        
        VolumeTabung b = new VolumeTabung();
        b.setKonstanta(3.14);
        b.setJari(14);
        b.setTinggi(15);
        
        System.out.println("");
        System.out.println("\t Program Rumus Volume Tabung");
        System.out.println("");
        System.out.println("Tabung dengan Luas Alas :"+b.Luas());
        System.out.println("dan Tinggi\t\t:"+b.getTinggi());
        System.out.println("Volume nya adalah\t:"+b.Volume());
        System.out.println("");
        
    }
}
