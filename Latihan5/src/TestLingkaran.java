/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestLingkaran {
    public static void main (String[] args){
        float R=1.0f;
        float T=10;
        System.out.println("Jari-jari : "+R);
        System.out.println("Luas Lingkaran : "+LuasLing(R));
    }
    private static float LuasLing(float R){
        return (22f/7)*R*R;
    }
}
