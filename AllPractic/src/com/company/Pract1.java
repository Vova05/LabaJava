package com.company;

import java.util.Arrays;
import java.util.Random;

public class Pract1 {
    void Pract(){
        int[] array=new int[100];
        Random rand=new Random();
        for(int i=0;i<100;i++){
            array[i]= rand.nextInt(100);
        }
        for(int i=50;i<100;i++ ){
            array[i]=(int)(Math.random()*10);
        }
        int i=0;
        while(i< array.length){
            System.out.println(array[i]);
            i++;
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print("Факториал :");
        System.out.println(fuctorial(5));
    }
    static int fuctorial(int number){
        int tmp=0;
        int resolt=0;
        do{
            resolt+=tmp;
            tmp++;
        }while (tmp<number);
        return resolt;
    }
}
