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
public class Bujursangkar {
    public int sisi;
    public int Keliling;
    public int luas;
    
    public Bujursangkar(int s){
        sisi = s;
        luas = s * s;
        Keliling = 4 * s;
    }
 
    public int getLuas (){
        return luas;
    }
    
    public int getKeliling (){
        return Keliling;
    }
    
    public void cetakLuas(){
        System.out.println("Luas Bujursangkar\t:"+luas);
    }
    
    public void cetakKeliling(){
        System.out.println("Keliling Bujursangkar\t:"+Keliling);
    }
        
    
}
