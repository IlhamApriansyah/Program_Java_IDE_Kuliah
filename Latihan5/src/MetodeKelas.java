/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class MetodeKelas {
    public static void main(String [] args){
        double bilangan = Matematika.kuadrat(25.0);
        System.out.println(bilangan);
    }
}
    
    class Matematika{
        static public double kuadrat (double nilai){
            return nilai*nilai;
        }
    }