/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraypackage;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class DataMahasiswa {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Mahasiswa :");
        int n = input.nextInt();
        
        String nama[] = new String[n];
        String status[] = new String[n];
        int nilai[] = new int[n];
        
        for (int i=0; i<n; i++){
            System.out.println("Mahasiswa ke : "+(i+1));
            System.out.println("Nama :");
            nama[i]=input.next();
            
            System.out.println("Nilai :");
            nilai[i]=input.nextInt();
            
            if(nilai[i]<=50){
                status[i] = "Tidak Lulus";
            }
            else {
                status[i] = "Lulus";
            }
        }
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("======================");
        System.out.println("No Nama Nilai Status   ");
        
        for(int i=0; i<n; i++){
            System.out.println((i+1)+ " "+nama[i]+" "+nilai[i]+" "+status[i]);
        }
    }
  }
            
          
      
 
