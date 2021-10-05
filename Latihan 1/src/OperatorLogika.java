/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class OperatorLogika {
    public static void main (String[] args){
        String NIM = "1904030007", nama = "Ilham Apriansyah";
        String mataKuliah = "Pemrograman Berorientasi Objek 1";
        byte jmlSKS = 23;
        int biayaPerSKS = 50000;
        byte nilAbsen = 100, nilTugas = 80, nilUTS = 70, nilUAS = 60;
        
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
        System.out.println("======================================");
        int total = ((nilAbsen*10/100) + (nilTugas*20/100) + (nilUTS*30/100) + (nilUAS*20/100));
        System.out.println("Nilai Total :"+total);
        System.out.println("======================================");
        System.out.println("Total>=85 dan Total<=100 :"+((total>=85 && total<=100)));
        System.out.println("Total>=75 dan Total<85\t:"+((total>=75 && total<85)));
        System.out.println("Total>=60 dan Total<75\t:"+((total>=60 && total<75)));
        System.out.println("Total>=35 dan Total<60\t:"+((total>=35 && total<60)));
        System.out.println("Total>=0 dan Total<35\t:" +((total>=0 && total<35)));
    }
}
