/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Tes {
    public static void main(String [] args){
        Data data =new Data();
        
      
        data.setQ (50);
        data.Tampil();
    }
}
    
    class Data{
        private int P=9;
        private int Q=8;
        public void setQ(int q){Q=q;}
        public int getQ(){return Q;}
        public void Tampil(){
            System.out.println(P+" "+Q);
        }
    }
