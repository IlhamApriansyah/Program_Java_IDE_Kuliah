/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methodpackage;

/**
 *
 * @author Administrator
 */
public class RumusLuasPersegi {
    private int panjang;
    private int lebar;
    private int luas;
    
    public int HitungLuas(){
        luas = panjang * lebar;
        return luas;
    }
    
    public void Hasil(){
        System.out.println("Luas dari persegi tersebut adalah :"+HitungLuas()+"\n");
    }
    
    public void lebar(){
        System.out.println("Lebar persegi :"+lebar+"\n");
    }
    
    public void panjang(){
        System.out.println("Panjang persegi :"+panjang+"\n");
    }
    
    public static void main(String[]args){
        RumusLuasPersegi obj = new RumusLuasPersegi();
        obj.panjang = 15;
        obj.lebar = 5;
        
        System.out.println("\tProgram Menghitung Rumus Luas Persegi");
        obj.panjang();
        obj.lebar();
        obj.Hasil();
        
    }
}
