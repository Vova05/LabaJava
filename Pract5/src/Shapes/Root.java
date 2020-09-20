package Shapes;

public class Root {
    public static void main(String[] args) {
        Test s=new Test();
        s.go();
    }
}
abstract class Shape{
    private String color;
    private float area;
    Shape(String color,float area) {
        this.area=area;
        this.color=color;
    }
    String getColor(){
        return color;
    }
    float getArea(){
        return area;
    }
    abstract float getPerimeter();
    void setColor(String color){
        this.color=color;
    }
    void setArea(float area){
        this.area=area;
    }
    abstract String getInfo();
}
class Circle extends Shape{

    private float radius;
    Circle(String color, float area,float radius) {
        super(color, area);
        this.radius=radius;
    }

    @Override
    float getPerimeter() {
        float tmp= (float) (2*3.14*radius);
        return (tmp);
    }

    @Override
    String getInfo() {
        return ("Circle radius ="+radius+" Color = "+getColor());
    }

    void setRadius(float radius){
        this.radius=radius;
    }
    float getRadius(){
        return radius;
    }
}
class Rectangle extends Shape{
    private   int ab,ac,bc;
    Rectangle(String color, float area) {
        super(color, area);
    }

    @Override
    float getPerimeter() {
        int tmp=ab+ac+bc;
        return 0;
    }

    @Override
    String getInfo() {
        return ("Rectangle perimeter = "+getPerimeter()+" Color = "+getColor());
    }

    void setAb(int ab){
        this.ab=ab;
    }
    void setAC(int ac){
        this.ac=ac;
    }
    void setBC(int bc){
        this.bc=bc;
    }

}
class Cylinder extends Circle{

    private float high;
    Cylinder(String color, float area, float radius,float high) {
        super(color, area, radius);
        this.high=high;
    }
    float getVolume(){
        return (getArea()*high);
    }

    @Override
    String getInfo() {
        return super.getInfo()+" high = "+high;
    }
}
class Corners extends Rectangle{

    private int ab,ac,bc;
    Corners(String color, float area,int ac,int ab,int bc) {
        super(color, area);
        this.ab=ab;
        this.ac=ac;
        this.bc=bc;

    }
    double getCornA(){
        double a=(double)ac/(double) ab;
        return (a);
    }
    double getCornB(){
        double b=(double)bc/(double)ac;
        return (b);
    }
}
class Test{
    void go(){
        /*Cylinder obj=new Cylinder("black",23,5,90);
        System.out.println(obj.getRadius()+" "+obj.getVolume());
        Rectangle a=new Rectangle("black",5);
        a.setAb(2);
        a.setAC(3);
        a.setBC(6);
        Corners obj1=new Corners("white",5,5,3,4);
        System.out.println(obj1.getInfo());
        System.out.println(obj.getInfo());*/
        //MovableRectangle obj2=new MovableRectangle("ss",3,2,-1);
        SpeedTest a=new SpeedTest();
        MovablePoint a1=new MovablePoint("red",12,12,-1,0,0);
        MovablePoint a2=new MovablePoint("blue",10,16,1,-100,0);
        a.moveTest(a1,a2);
    }
}
interface Movable{
     default int getMovableStart(int speed,int direction){
        return speed*direction;
    }
}
class MovableRectangle extends Rectangle implements Movable{
    private int speed,direction,startX,startY;
    MovableRectangle(String color, float area,int speed,int direction,int startX,int startY) {
        super(color, area);
        this.speed=speed;
        this.direction=direction;
        this.startX=startX;
        this.startY=startY;
    }
    int getSpeed(){
        return speed;
    }
    int getDirection(){
        return direction;
    }
    int getStartPosition(){
        return startX;
    }
    int getMovable(){
        return getMovableStart(speed,direction);
    }
}
class MovablePoint extends MovableRectangle implements Movable{

    private int position=getStartPosition();
    MovablePoint(String color, float area, int speed, int direction, int startX, int startY) {
        super(color, area, speed, direction, startX, startY);
        position=startX;
    }
    int getPosition(){
        return position;
    }
    void setPosition(int speed){
        position+=speed;
    }

}
class SpeedTest{
    void moveTest(MovablePoint a1,MovablePoint a2){
        a1.setPosition(10);
        a2.setPosition(-40);
        if((a1.getPosition()-a1.getStartPosition())==(a2.getPosition()-a2.getStartPosition())){
            System.out.println("Равны");
        }else{
            System.out.println("Не равны");
        }
    }
}
