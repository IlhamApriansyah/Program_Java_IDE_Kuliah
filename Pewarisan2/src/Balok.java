/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Balok extends PersegiPanjang {
    private int tinggi;

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    public int Volume(){
        int v = getPanjang() * getLebar() * tinggi;
        return v;
    }
}
