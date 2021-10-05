/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class MahasiswaTeknik {
   private String Nama;
   private int NIP;
   static String JUR;
   private MahasiswaTeknik(String n, int m,String s){Nama = n; JUR = s; NIP = m;}
   public void Tampilkan(){
       System.out.println("\t\tDaftar Mahasiswa Teknik             \t");
       System.out.println("---------------------------------------------------------------------");
       System.out.println("No\t     Nama\t          NIP\t            Jurusan");
       System.out.println("---------------------------------------------------------------------");
   }
   public void Tampilkan2(){
         System.out.println("\t"+Nama+"\t"+NIP+"\t"+JUR);
   }
   public static void main(String []args){
      MahasiswaTeknik Mhs1 = new MahasiswaTeknik ("Ilham Apriansyah",1904030007,"Teknik Informatika");
      MahasiswaTeknik Mhs2 = new MahasiswaTeknik ("Teuku Cut\t",1904030001,"Teknik Informatika");
      MahasiswaTeknik Mhs3 = new MahasiswaTeknik ("Ilham Romadona\t",1904030003,"Teknik Informatika");
      
      Mhs1.Tampilkan();  
      Mhs1.Tampilkan2();
      Mhs2.Tampilkan2();
      Mhs3.Tampilkan2();
   }
        }


