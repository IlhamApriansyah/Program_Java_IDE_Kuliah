/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Polymorphism {
    public static void main (String []args){
       TampilData abc = new TampilData();
       
       System.out.println("Cetak data string : ");
       abc.tulisData("UNIS");
       
       System.out.println("Cetak data integer : ");
       abc.tulisData(2020);
       
       System.out.println("Cetak data double : ");
       abc.tulisData(25.54);
    }
    
}
