package Pract22;


import java.util.Scanner;

public class Root extends MyException{
    private static Struct[] array=new Struct[100];

    Root(String st) {
        super(st);
    }

    public static void main(String[] args) throws MyException {
        Struct a=new Struct("Skyoker","Luke","Vader",111111);
        array[0]=a;
        MyException ob=new MyException("");
        Scanner scanner=new Scanner(System.in);
        if(scanner.nextLine()=="Skyoker"){
            System.out.println("CHek");
        }else{
            throw new MyException("Error :"+ob.Exception1()){};
        }

    }

}
class Struct{
    public String family_name;
    public String name;
    public String father_name;
    public int INN;
    Struct(String family_name,String name,String father_name,int INN){
        this.family_name=family_name;
        this.name=name;
        this.father_name=father_name;
        this.INN=INN;
    }
}