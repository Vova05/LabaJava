package Pract22;
import java.util.Scanner;
import java.util.ArrayList;

public class Root{
    public static void main(String[] args) {
        ArrayList<User> userLst = new ArrayList<User>();

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        for (int i = 0; i < 5; i++) {
            System.out.print("Введито ФИО и ИНН\n");
            String name = sc.next();
            String fullname = sc.next();
            String patronymic = sc.next();
            String INN = sc.next();

            if (INN.length() != 12) {
                System.out.println("Bad individual tax number");
                continue;
            } else {
                for (int j = 0; j < userLst.size(); j++)
                    if (userLst.get(j).INN.equals(INN)) {
                        System.out.println("Your INN already in our database!");
                        flag = false;
                        break;
                    }
                if (flag) {
                    userLst.add(new User(name, fullname, patronymic, INN));
                    System.out.println("You were added!");
                }
                flag = true;
            }
        }
    }
}

class User {
    String name;
    String fullname;
    String patronymic;
    String INN;

    public User(String name, String fullname, String patronymic, String INN) {
        this.name = name;
        this.fullname = fullname;
        this.patronymic = patronymic;
        this.INN = INN;
    }
    public void setINN(String INN) {
        this.INN = INN;
    }
}