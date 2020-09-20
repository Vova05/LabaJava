package com.company;

public class Root {
    public static void main(String[] args) {
       Circle circle1=new Circle();
       Rectangle rectangle1=new Rectangle();

       circle1.CalcArea();
       rectangle1.getColorToBlack();
       rectangle1.CalcArea();
    }
}
abstract class Shape{
    double area=10;
    String color;
    abstract float CalcArea();
    void getColorToBlack(){
        color="Black";
    }
}
class Circle extends Shape{
    double radius=5;
    @Override
    float CalcArea() {
        System.out.println(area);
        return 0;
    }
}
class Rectangle extends Shape{

    double sideX=2;
    double sideY=4;
    @Override
    float CalcArea() {
        System.out.println(sideX*sideY);
        return 0;
    }

    @Override
    void getColorToBlack() {
        super.getColorToBlack();
        System.out.println(color);
    }
}
