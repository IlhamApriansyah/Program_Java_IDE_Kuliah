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
public class TesGeometri {
    public static void main(String [] args){
        Lingkaran R1 = new Lingkaran (1);
        Epp E1 = new Epp(5, 10);
        Bujursangkar R2 = new Bujursangkar (2);
        Jajargenjang R3 = new Jajargenjang (15,10,5,4,10);
        Segitiga E2 = new Segitiga (5,15,4,3,4);
        
        R1.cetakluas();
        R1.cetakkeliling();
        
        E1.cetakluas();
        E1.cetakKeliling();
        
        
        R2.cetakLuas();
        R2.cetakKeliling();
        
        R3.cetakGarissjj();
        R3.cetakLuas();
        R3.cetakKeliling();
      
        E2.cetakLuas();
        E2.cetakKeliling();
    }
}
