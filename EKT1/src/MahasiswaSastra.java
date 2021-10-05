/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class MahasiswaSastra {
   private String Nama;
   private int NIP;
   static String JUR;
   private MahasiswaSastra(String n, int m,String s){Nama = n; JUR = s; NIP = m;}
   
   public void Tampilkan(){
       System.out.println("\t\tDaftar Mahasiswa Sastra        \t");
       System.out.println("---------------------------------------------------------------------");
       System.out.println("No\t     Nama\t          NIP\t            Jurusan");
       System.out.println("---------------------------------------------------------------------");
   }
   
   public void Tampilkan2(){
       System.out.println("\t"+Nama+"\t"+NIP+"\t"+JUR);
   }
   
    public static void main(String []args){
      MahasiswaSastra Mhs1 = new MahasiswaSastra ("Aris Pangestu\t",1904030010,"Teknik Sastra");
      MahasiswaSastra Mhs2 = new MahasiswaSastra ("Muhammad Iqbal\t",1904030030,"Teknik Sastra");
  
      
      Mhs1.Tampilkan();  
      Mhs1.Tampilkan2();
      Mhs2.Tampilkan2();
     
}
}