/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.io.*;
public class string1 {
    public static void main (String []args){
        String Nama = "";
        BufferedReader objInput = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.println("===================================");
        System.out.println("\t Input Data Mahasiswa");
        System.out.println("===================================");
        System.out.println("Nama \t");Nama = objInput.readLine();
        System.out.println("===================================");
    }
        catch(Exception e){
            System.out.println("error"+e);
        }
        System.out.println("===================================");
        System.out.println("\t Input Data Mahasiswa");
        System.out.println("===================================");
        System.out.println("\t Input Data Mahasiswa");
        System.out.println("Nama \t\t\t\t\t\t\t: "+Nama);
        
        System.out.println("Panjang Nama \t\t\t\t\t\t: "+Nama.length());
        System.out.println("Nama digabung dengan -Nama ku-\t\t\t\t: "+Nama.concat("Nama ku"));
        System.out.println("Pembandingan Nama dengan -Jati-\t\t\t\t: "+Nama.equals("Jati"));
        System.out.println("Mengganti huruf A dengan B\t\t\t\t: "+Nama.replace("A","B"));
        System.out.println("Mengganti string Adam dengan Mada\t\t\t: "+Nama.replaceAll("Adam","Mada"));
        System.out.println("Mengganti string A pertama ketemu dengan B\t\t: "+Nama.replaceFirst("a","b"));
        System.out.println("Nama menjadi huruf Kecil\t\t\t\t: "+Nama.toLowerCase());
        System.out.println("Nama menjadi huruf Besar\t\t\t\t: "+Nama.toUpperCase());
        System.out.println("Mengambil tulisan dari lokasi 4 hingga huruf terakhir\t: "+Nama.substring(4));
        System.out.println("Mengambil tulisan mulai dari lokasi ke 3 hingga ke 4\t: "+Nama.substring(3, 4));
        System.out.println("Mengambil karakter pada lokasi 1\t\t\t: "+Nama.charAt(1));
        System.out.println("Mengambil lokasi sebuah huruf m\t\t\t\t: "+Nama.indexOf("m"));
        System.out.println("========================");
    }
}
