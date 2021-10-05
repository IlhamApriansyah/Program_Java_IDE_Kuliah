/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ForLoop {
    public static void main (String [] args){
        
        int n = 6 ;
        
        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                
                String pesan = (i%2!=0 ? i + " " : j + " ");
                System.out.println(pesan);
            }
            System.out.println();
        }
        
    }
}
