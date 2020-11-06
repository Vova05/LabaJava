package Pract18;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pract181 a=new Pract181();
        a.resolt(sc.nextDouble());
        Pract182 b=new Pract182();
        b.resolt();
        Pract183 c = new Pract183();
        int maxNumber = c.maxNumber();
        if (maxNumber == Integer.MIN_VALUE) {
            System.out.println("Последовательность пуста");
        }else {
            System.out.println("Максимальное значение последовательности: " + maxNumber);
            }
        }
}
