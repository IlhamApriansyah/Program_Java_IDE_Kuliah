/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Dog {
    private String nama = "Noname" ;
    private int umur  = 0;
    public Dog (String nm, int um){nama = nm; umur = um;}
    public void bark(){
        System.out.println("Guk... Guk....");
    }
    public void sayHello (){
        System.out.println("Hello my name is "+nama+" i am a "+umur+" years old");
    }
    
    public static void main (String[]args ){
        Dog myDog = new Dog("Heli",3);
        Dog yourDog = new Dog("Petrik",1);
        Dog hisDog = new Dog("Dora",2);
        
        myDog.bark();
        myDog.sayHello();
        System.out.println(" Kenalkan Anjingmu : ");
        yourDog.sayHello();
        hisDog.sayHello();
        
    }
    
}
