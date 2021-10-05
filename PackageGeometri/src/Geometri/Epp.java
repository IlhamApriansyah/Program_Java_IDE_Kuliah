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
public class Epp {
    double panjang;
    double lebar;
    double luas;
    double keliling;
    
    public Epp(double p, double l){
        panjang = p;
        lebar = l;
        luas = p * l;
        keliling = 2 * (p * l);
    }
    
    public double getLuas(){
        return luas;
    }
    public double getKeliling(){
        return keliling;
    }
    public void cetakluas(){
        System.out.println("Luas EPP\t:"+luas);
    }
    public void cetakKeliling(){
        System.out.println("Keliling EPP\t:"+keliling);
    }
}
