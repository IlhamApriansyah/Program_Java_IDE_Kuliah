/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Mahasiswa {
    String Nama;
    int Umur;
    
    private void SetData(String n, int u){Nama=n; Umur=u;}
    
    public void CetakInfo(){
        System.out.println("Namaku : "+Nama);
        System.out.println("Umur : "+Umur);        
    }
    public static void main(String[] args){
        Mahasiswa Mhs1 = new Mahasiswa();
        Mahasiswa Mhs2 = new Mahasiswa();
        
        Mhs1.SetData("Jon Saleh", 20);
        Mhs2.SetData("Siti", 17);
        
        Mhs1.CetakInfo();
        Mhs2.CetakInfo();
    }
}
