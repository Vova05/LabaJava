package Pract22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
    public static int searchUser(List<Buyer> ar, String name) throws  MyException {
        for (int i = 0; i < ar.size(); i++){
            if (ar.get(i).getName().equals(name)){
                return i;
            }
        }
        throw new MyException("Name not found");
    }

    public static void main(String[] args) throws NoSuchFieldException, MyException {
        List<Buyer> buyers = new ArrayList();
        Buyer buyer1 = new Buyer("Ivan",4);
        Buyer buyer2 = new Buyer("Vova",5);
        Buyer buyer3 = new Buyer("Lena",5.1);
        Buyer buyer4 = new Buyer("Liza",5);
        Buyer buyer5 = new Buyer("Egor",2.4);
        buyers.add(buyer1);
        buyers.add(buyer2);
        buyers.add(buyer3);
        buyers.add(buyer4);
        buyers.add(buyer5);

        ArrayList<Comparable> st = new ArrayList<Comparable>();
        st.addAll(buyers);

        Collections.sort(buyers);
        buyers.forEach(buyer -> System.out.println(buyer));

        System.out.println("\nИщем покупателя Lena");
        try {
            System.out.println(buyers.get(searchUser(buyers, "Lena")));
        }catch (Exception ex){
            throw new MyException("Name not found");
        }
        System.out.println("\nИщем покупателя Afanasy");
        try {
            System.out.println(buyers.get(searchUser(buyers, "Afanasy")));
        }catch (Exception ex){
            System.out.println("Name not found");
            throw new MyException("Name not found");
        }
        //Вывод работы программы:

//       Student{ID=3, GPA=2.0, name='Kirill'}
//Student{ID=4, GPA=2.4, name='Gregory'}
//Student{ID=2, GPA=3.1, name='Lena'}
//Student{ID=1, GPA=3.3, name='Vova'}
//Student{ID=0, GPA=4.0, name='Ivan'}
//
//Ищем покупателя Lena
//Student{ID=2, GPA=3.1, name='Lena'}
//
//Ищем покупателя Afanasy
//Name not found
//Exception in thread "main" Pract22.MyException: Name not found
//	at Pract22.Tester.main(Tester.java:47)

    }
}
class MyException extends Exception{
     MyException(String message) {
        super(message);
    }
}
