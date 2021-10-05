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
public class Jajargenjang {
    private int garissjj;
    private int alas;
    private int tinggi;
    private int luas;
    private int Keliling;
    
    
    public Jajargenjang(int alas, int tinggi, int G, int a, int b){
        
        garissjj = G;
        luas = alas * tinggi;
        Keliling = 2 * (a+b);
    }

    public int getGarissjj(){
         return garissjj;
    }
     
     public int getLuas (){
        return luas;
    }
    
    public int getKeliling (){
        return Keliling;
    }
    
    public void cetakGarissjj(){
        System.out.println("Garis Jajar Genjang\t:"+garissjj);
    }
    
    public void cetakLuas(){
        System.out.println("Luas Jajargenjang\t:"+luas);
    }
    
    public void cetakKeliling(){
        System.out.println("Keliling Jajargenjang\t:"+Keliling);
    }
}
