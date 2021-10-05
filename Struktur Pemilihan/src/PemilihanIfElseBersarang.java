
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PemilihanIfElseBersarang {
         public static void main ( String [] args){
        String NIM = "", nama = "";
        byte nilAbsen = 0, nilTugas = 0, nilUTS = 0, nilUAS = 0;
        BufferedReader objInput = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("================================");
            System.out.println("\tInputDataMahasiswa");
            System.out.println("================================");
            System.out.println("NIM\t\t:");NIM = objInput.readLine();
            System.out.println("Nama\t\t:");nama = objInput.readLine();
            System.out.println("Nilai Absen\t\t:");nilAbsen = Byte.parseByte(objInput.readLine());
            System.out.println("Nilai Tugas\t\t:");nilTugas = Byte.parseByte(objInput.readLine());
            System.out.println("Nilai UTS\t\t:");nilUTS = Byte.parseByte(objInput.readLine());
            System.out.println("Nilai UAS\t\t:");nilUAS = Byte.parseByte(objInput.readLine());
            System.out.println("================================");
        }
        catch(Exception e){
            System.out.println("Error"+e); 
        }
        System.out.println("=====================================");
        System.out.println("\tCetak Data Mahasiswa");
        System.out.println("=====================================");
        System.out.println("NIM\t\t:"+NIM);
        System.out.println("Nama\t\t:"+nama);
        System.out.println("Nilai Tugas\t:"+nilTugas);
        System.out.println("Nilai UTS\t:"+nilUTS);
        System.out.println("Nilai UAS\t:"+nilUAS);
        System.out.println("=====================================");
        
        int Total = ((nilAbsen*10/100)+(nilTugas*20/100)+(nilUTS*30/100)+(nilUAS*40/100));
        System.out.println("Nilai Total\t"+Total);
        
        char grade = 'E';
        if(Total>=85 && Total<=100)
             grade = 'A';
        else if(Total>=75 && Total<85)
             grade = 'B';
        else if(Total>=60 && Total<75)
             grade = 'C';
        else if(Total>=35 && Total<60)
             grade = 'D';
        else
             grade = 'E';
        
        System.out.println("=====================================");
        System.out.println("Grade\t\t:"+grade);
        System.out.println("=====================================");
         }
}
