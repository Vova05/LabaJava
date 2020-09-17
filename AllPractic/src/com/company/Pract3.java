package com.company;

public class Pract3 {
    class CirclTest{
        void go(){
            Circl obj=new Circl();
            obj.setDataR(1);
            obj.setDataD(2);
            obj.setDataS(5);
            System.out.println(obj.getD()+" "+obj.getR()+" "+obj.getS());
        }
    }

    class Circl extends Pract3{
        private int S;
        private int R;
        private int D;
        void setDataS(int S){
            this.S=S;
        };
        void setDataR(int R){
            this.R=R;
        };
        void setDataD(int D){
            this.D=D;
        };
        int getD(){
            return this.D;
        }
        int getS(){
            return this.S;
        }
        int getR(){
            return this.R;
        }

    }
    class TestHuman{
        void goTest(){
            Head obj=new Head();
            obj.setBones(4);
            obj.setWeight(5);
            Hand obj1=new Hand();
        }
    }
    abstract class Human{
        private int weight;
        private int bones;
        void setBones(int bones){
            this.bones=bones;
        }
        void setWeight(int weight){
            this.weight=weight;
        }
        int getBones(){
            return bones;
        }
        int getWeight(){
            return weight;
        }
    }
    class Head extends Human{}
    class Hand extends Human{}
    class Lag extends Human{}
    class Book{
        private String autor;
        private int age;
        private String title;
        Book(String autor,int age,String title){
            this.age=age;
            this.autor=autor;
            this.title=title;
        }
        void setAge(int age){
            this.age=age;
        }
        void setAutor(String a){
            this.autor=a;
        }
        void setTitle(String a){
            this.title=a;
        }
        int getAge(){
            return this.age;
        }
        String getAutor(){
            return this.autor;
        }
        String getTitle(){
            return this.title;
        }
    }
}

