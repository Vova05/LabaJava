package com.company;

import java.util.Scanner;

public class Test {
    public static void test(){
        while(true) {
            System.out.println("Введите номер задания для проверки (для завершения введите 0): ");
            Scanner num=new Scanner(System.in);
            int work=num.nextInt();
            switch (work){
                case 0:{
                    return;
                }
                case 3:{
                    newOwener obj=new newOwener("Bob",1,"Labrador","Moscow","89255346474");
                    obj.displayInfo();
                    obj.DisplayInfo2();
                    break;
                }
                case 4:{
                    BreedImpl obj=new BreedImpl();
                    System.out.println(obj.getName());
                }
            }
        }

    }
}
