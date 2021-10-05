/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class LuasLingkaran {
    private double konstanta;
    private int jari;

    public void setKonstanta(double konstanta) {
        this.konstanta = konstanta;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public double getKonstanta() {
        return konstanta;
    }
    
    public int getJari() {
        return jari;
    }
    
    public double Luas(){
        double Luas = (int) (konstanta * (jari * jari));
        return Luas;
    }
}
