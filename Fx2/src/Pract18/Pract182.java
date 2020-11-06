package Pract18;

import java.util.Scanner;

public class Pract182 {
    public boolean palindrome(String st){
        return (st.equals(new StringBuilder(st).reverse().toString()));
    }
    public void resolt(){
        Scanner sc = new Scanner(System.in);

        if (palindrome(sc.nextLine()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
