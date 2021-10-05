/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.io.* ;
public class StringBuffer1 {
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
            System.out.println("Error"+e);
        }
      StringBuffer nama = new StringBuffer(Nama);
      
      System.out.println("===================================");
      System.out.println("\t Cetak Data Mahasiswa");
      System.out.println("===================================");
      System.out.println("Nama \t\t\t\t\t\t\t\t: "+Nama);
      
      System.out.println("Panjang Nama \t\t\t\t\t\t\t: "+nama.length());
      System.out.println("Nama digabung dengan -Nama ku-\t\t\t\t\t: "+nama.append("Nama ku"));
      System.out.println("Pembandingan Nama dengan -Ilham Apriansyah-\t\t\t: "+nama.equals("Ilham Apriansyah"));
      System.out.println("Mengganti string pada lokasi 1 sd 5\t\t\t\t: "+nama.replace(1, 5, "Ganti Namaku"));
      System.out.println("Mengambil tulisan dari lokasi ke 4 hingga huruf terakhir\t: "+nama.substring(4));
      System.out.println("Mengambil karakter pada lokasi pertama\t\t\t\t: "+nama.charAt(1));
      System.out.println("Menghapus karakter lokasi 1\t\t\t\t\t: "+nama.deleteCharAt(1));
      System.out.println("Mengambil lokasi huruf m\t\t\t\t\t: "+nama.indexOf("m"));
      System.out.println("Membalik tulisan nama\t\t\t\t\t\t: "+nama.reverse());
      
     }
}
