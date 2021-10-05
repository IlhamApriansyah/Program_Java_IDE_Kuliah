
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class InputScanner {
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int nilai1;
        int nilai2;
        int jumlah;
        
        System.out.println("Masukkan angka ke 1 : ");
        nilai1 = Input.nextInt();
        
        System.out.println("Masukkan angka ke 2 : ");
        nilai2 = Input.nextInt();
        
        jumlah = nilai1 + nilai2;
        
        System.out.print("jumlah :");
        System.out.println(jumlah);
        
    } 
}
