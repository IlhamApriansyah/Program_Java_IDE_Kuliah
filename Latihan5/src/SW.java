/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SW {
    public static void main (String [] args){
        sw1 a = new sw1();
        sw1 b = new sw1();
        a.P=111;
        a.Q=10;
        b.P=99;
        b.Q=20;
        a.Tampil();
        b.Tampil();
    }
}

    class sw1{
       static int P=9;
       int Q=8;
                void Tampil(){
                    System.out.println(P+" "+Q);
                }
    }