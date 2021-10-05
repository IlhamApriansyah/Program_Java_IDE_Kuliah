/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class DemoPewarisan {
    public static void main(String [] args){
        PersegiPanjang a = new PersegiPanjang();
        
        a.setPanjang(5);
        a.setLebar(7);
        
        System.out.println("");
        System.out.println("Contoh Program Pewarisan");
        System.out.println("");
        System.out.println("Superclass Persegi Panjang");
        System.out.println("Panjang :"+a.getPanjang());
        System.out.println("Lebar :"+a.getLebar());
        System.out.println("Luas :"+a.luas());
        System.out.println("");
        
        Balok b = new Balok();
        b.setPanjang(3);
        b.setLebar(6);
        b.setTinggi(7);
        
        System.out.println("Subclass Balok");
        System.out.println("Panjang :"+b.getPanjang());
        System.out.println("Lebar :"+b.getLebar());
        System.out.println("Tinggi :"+b.getTinggi());
        System.out.println("Volume :"+b.Volume());
    }
}
