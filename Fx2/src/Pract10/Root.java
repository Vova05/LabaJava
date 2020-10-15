package Pract10;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        int a,b;
        Scanner a_sc= new Scanner(System.in);
        a=a_sc.nextInt();
        b=a_sc.nextInt();

        int c=0,sum=0,num=0;

        int min=(int)Math.pow(10,a-1);
        int max=(int)Math.pow(10,a);
        for(int i=min;i<max;i++){
            sum=0;
            num=i;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            if(sum==b){
                c++;
            }
        }
        System.out.println(c);
        System.out.println(rec(a_sc.nextInt(),a_sc.nextInt()));
        rec2(a_sc.nextInt());
    }
    public static int rec(int a,int b){
        if(a>b+1){
            return 0;
        }
        if(b==0||a==0){
            return 1;
        }
        return (rec(a,b-1)+rec(a-1,b-1));
    }
    public static void rec2(int number){
        if(number>=10) {
            rec2(number / 10);
        }
            System.out.print(number%10+" ");
    }
}
