/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class PengoperasianKarakter {
    public static void main (String [] args){
        char karakter;
        String stringKu;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan karakter :");
        stringKu = input.nextLine();
        
        karakter = stringKu.charAt(0);
        System.out.println("Karakter adalah : "+karakter);
        
        if(Character.isUpperCase(karakter)){
            System.out.println(karakter+" adalah Uppercase atau Huruf Besar");
        }else{
            System.out.println(karakter+" Bukan Uppercase atau Huruf Besar");
        }
        
        if(Character.isLowerCase(karakter)){
            System.out.println(karakter+" adalah lowercase atau huruf kecil");
        }else{
            System.out.println(karakter+" adalah bukan lowercase atau huruf kecil");
        }
         
        karakter = Character.toLowerCase(karakter);
            System.out.println("Setelah lower case karakter nya adalah : "+karakter);
        
        karakter = Character.toUpperCase(karakter);
            System.out.println("Setelah Upper Case karakter nya adalah : "+karakter);
            
        if(Character.isLetterOrDigit(karakter)){
            System.out.println(karakter+" adalah huruf atau angka");
        }else{
            System.out.println(karakter+" adalah bukan huruf atau angka");
        }
        
          if(Character.isWhitespace(karakter)){
            System.out.println(karakter+" Merupakan whitespace");
        }else{
            System.out.println(karakter+" bukan merupakan whitespace");
        }
          
    }
}
