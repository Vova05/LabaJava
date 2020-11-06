package Pract18;

import java.util.ArrayList;
import java.util.Scanner;

public class Pract183 {
    private ArrayList<Integer> arrayList;

    Pract183(){
        arrayList = new ArrayList<Integer>();
        input();
    }

    public int maxNumber(){
        int maxNumber = Integer.MIN_VALUE;
        for (Integer number : arrayList)
            if (number > maxNumber)
                maxNumber = number;
        return maxNumber;
    }

    public void input(){
        if (!arrayList.isEmpty())
            arrayList.clear();
        Scanner sc = new Scanner(System.in);
        int buff = 0;
        buff = sc.nextInt();
        while(buff != 0) {
            arrayList.add(buff);
            buff = sc.nextInt();
        }
    }
}
