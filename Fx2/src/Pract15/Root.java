package Pract15;
import java.util.Scanner;

public class Root {
    static ProgresCollection collection = new ProgresCollection();

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
            collection.addElement((int) (Math.random() * 100));
        printCollection();

        while (true) {
            System.out.println("Введите номер команды для проверки работы коллекции и 0 для завершения работы: ");
            Scanner scanner = new Scanner(System.in);
            int result, tmp=0;
            tmp=scanner.nextInt();
            switch (tmp) {
                case 0:
                    return;
                case 1:
                System.out.println("Индекс удаляемого элемента: ");
                collection.delete(scanner.nextInt());
                printCollection();
                break;
                case 2:
                System.out.println("Введите значение элемента для поиска его позиции: ");
                result = collection.searchByItem(scanner.nextInt());
                if (result != Integer.MIN_VALUE)
                    System.out.println(result);
                else
                    System.out.println("Не найден");
                break;
                case 3:
                System.out.println("Введите индекс для поиска элемента: ");
                result = collection.searchByIndex(scanner.nextInt());
                if (result != Integer.MIN_VALUE)
                    System.out.println(result);
                else
                    System.out.println("Не найден");
                break;
                case 4:
                result = collection.maxItem();
                if (result != Integer.MIN_VALUE)
                    System.out.println("Значение максимального элемента = " + result);
                else
                    System.out.println("Не найден");
                break;
                case 5:
                result = collection.minItem();
                if (result != Integer.MAX_VALUE)
                    System.out.println("Значение минимального элемента = " + result);
                else
                    System.out.println("Не найден");
                break;
                case 6:
                System.out.println("Среднее арифметическое значение элементов коллекции = " + collection.averageNumber());
                break;
            }
        }
    }
    static void printCollection(){
        for (int i = 0; i < collection.getSize(); i++)
            System.out.print(collection.searchByIndex(i) + " ");
        System.out.print("\n");
    }
}
