package Pract18;

public class Pract181 {
    public static void resolt(double number){
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if(number % i ==0){
                System.out.print(i);
                number /= i;
                if(number > 1)
                    System.out.print(' ');
            }
            else
                i++;
        }

        if(number > 1)
            System.out.print(number);
    }
}
