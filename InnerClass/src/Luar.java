/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Luar {
    private int a;
    public void setA(int nilai){
    a = nilai;
}
public int getA(){
    return a;
}

public class Dalam{
    private int x =10;
    public void showData(){
        System.out.println("Nilai a dari Kelas Luar :"+a);
        System.out.println("Nilai x dari Kelas Dalam :"+x);
}
}

public void showData(){
    Dalam obj = new Dalam();
        obj.showData();
}
}
