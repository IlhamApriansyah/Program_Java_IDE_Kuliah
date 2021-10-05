/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class VolumeTabung extends LuasLingkaran {
    public int tinggi;
    public int Luas;

    public void setLuas(int Luas) {
        this.Luas = Luas;
    }

    public int getLuas() {
        return Luas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    public double Volume(){
        double v = Luas() * tinggi; 
        return v;
    }
}
