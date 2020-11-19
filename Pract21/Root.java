package Pract21;

import java.io.IOException;
import java.util.Scanner;

public class Root extends Exception {
    private int length;

    static void exceptionDemo(double i, int b) {
        double a=2.0/i;//кидает ошибку
        double c=2/b;//в данном случае джава считает число равным бесконечности
    }

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        //exceptionDemo(1,a.nextInt());
        //exceptionDemo(a.nextDouble(),1);
        Exception2 obj=new Exception2();
        while(true) {
            int b=0;
            try {
                obj.exceptionDemo();
            } catch (Throwable e) {
                System.out.println(e.getMessage());
                b=-1;//отлавливаем исключения при работе с функцией класса для продолжения работы программы в штатном режиме
            }finally {
                //обеспечивает работу программы до того момента пока не будет введено значение удовлетворяющее условию x!=0
                if(b!=-1){
                    break;
                }
            }
        }

    }
}
class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2 / i ); }
}
