/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Variabel4 {
    
        String NIM = "1904030007", nama = "Ilham Apriansyah";
        String mataKuliah = "Pemrograman Berorientasi Objek 1";
        byte jmlSKS = 23;
        int biayaPerSKS = 50000;
        byte nilAbsen = 100, nilTugas = 80, nilUTS = 70, nilUAS = 60;
        
        void cetak(){
        System.out.println("======================================");
        System.out.println("\t Data Mahasiswa     ");
        System.out.println("======================================");
        System.out.println("NIM\t\t :"  +NIM);
        System.out.println("nama\t\t :"  +nama);
        System.out.println("mataKuliah\t :"  +mataKuliah);
        System.out.println("SKS\t\t :"  +jmlSKS);
        System.out.println("Biaya Per SKS\t :"  +biayaPerSKS);
        System.out.println("Total Biaya\t :"  +(jmlSKS*biayaPerSKS));
        System.out.println("\nNilai Absen\t :"  +nilAbsen);
        System.out.println("Nilai Tugas\t :"  +nilTugas);
        System.out.println("Nilai UTS\t :"  +nilUTS);
        System.out.println("Nilai UAS\t :"  +nilUAS);  
    }
    public static void main (String[] args){
        Variabel4 obj4 = new Variabel4();
        //memanggil methode cetak lewat objek
        obj4.cetak();
    }
}