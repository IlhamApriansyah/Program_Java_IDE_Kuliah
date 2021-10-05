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
public class Segitiga {
    private int alas;
    private int tinggi;
    private double luas;
    private int keliling;
    private int panjang;
        
    public  Segitiga(int alas, int tinggi, int a, int b, int c){
        panjang = a;
        panjang = b;
        panjang = c;
        luas = 0.5 * alas * tinggi; 
        keliling = a+b+c;
        
    }
    
    public double getLuas(){
        return luas;
    }
    
    public int getKeliling(){
        return keliling;
    }
    
    public void cetakLuas(){
        System.out.println("Luas Segitiga\t\t:"+luas);
    }
    
    public void cetakKeliling(){
        System.out.println("Keliling Segitiga\t:"+keliling);
    }
 }
