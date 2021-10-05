/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Continue {
    public static void main(String[] args){
        int awal;
        awal = 0;
        while(awal <20){
            awal++;
            if(awal == 15){
                continue;
            }
            if(awal%2 !=0)
                System.out.println(awal+ " ");
        }
    }
}
