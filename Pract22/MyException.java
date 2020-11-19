package Pract22;

public class MyException extends Exception {
    MyException(String st){
        super("Error");
    }
    public void fail(){
        String message=Exception1();
    }
    public String Exception1(){
        return "Not the correct family name";
    }
    public void Exception2(){
        System.out.println("Not the correct name");
    }
    public void Exception3(){
        System.out.println("Not the correct father name");
    }
    public void Exception4(){
        System.out.println("Not the correct INN");
    }
}