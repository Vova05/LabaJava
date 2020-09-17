package com.company;

import java.util.Scanner;

public class Pract2 {

    void go(){
        Shape obj=new Shape("triangl",123,45);

    }
}
class Test{
    Dog[] arr=new Dog[2];
    void start(){
        Pract2 obj=new Pract2();
        obj.go();
        for(int i=0;i<arr.length;i++){
            homeDog obj1=new homeDog();
            arr[i]= obj1.add();
        }
        for(Dog i:arr){
            System.out.println(i.ToString());
        }
    }

    class homeDog{

        Dog add(){
            Scanner in=new Scanner(System.in);
            Scanner in1=new Scanner(System.in);
            Dog Ven=new Dog(in.nextLine(),in1.nextInt());
            return Ven;
        }
        void print(){
            for(Dog i:arr){
                System.out.println(i.setAge());
                System.out.println(i.setName());
                System.out.println(i.setAgeToP());
                System.out.println(i.ToString());
            }
        }

    }

}
class Shape{
    String name;
    int S;
    int V;
    Shape(String name,int S,int V){
        this.name=name;
        this.S=S;
        this.V=V;
    }
}
class Dog{
    private String name;
    private int age;
    Dog(String in,int in1){

        name=in;

        age=in1;
    }
    int setAge(){
        return age;
    }
    String setName(){
        return name;
    }
    int setAgeToP(){
        return age*7;
    }
    String ToString(){
        String st=age+"="+setAgeToP()+"  "+name;
        return st;
    }

}
