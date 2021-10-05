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
public class AccountTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Account myAccount = new Account();
        
        System.out.printf("Nama Inisial : %s%n%n",myAccount.getNama());
        
        System.out.println("Masukkan nama anda : ");
        String inputNama = input.nextLine();
        
        myAccount.setNama(inputNama);
        System.out.println();
        
        System.out.printf("Nama objek MyAccount : %s%n%n",myAccount.getNama());
    }
}
