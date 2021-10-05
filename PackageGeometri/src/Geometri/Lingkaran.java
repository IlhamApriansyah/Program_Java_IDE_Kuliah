/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometri;

/**
 *
 * @author Administrator
 */
public class Lingkaran {
    private double jari;
    private double luas;
    private double keliling;
    
    public Lingkaran(double r){
        jari = r;
        luas = 3.14*jari*jari;
        keliling = 2*3.14*jari;
    }
    
    public double getLuas (){
        return luas;
    }
    
    public double getKeliling (){
        return keliling;
    }
    
    public void cetakluas(){
        System.out.println("Luas Lingkaran\t\t:"+luas);
    }
    public void cetakkeliling(){
        System.out.println("Keliling Lingkaran\t:"+keliling);
    }
}

