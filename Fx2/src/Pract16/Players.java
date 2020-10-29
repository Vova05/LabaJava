package Pract16;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Players {
    private ArrayDeque<Integer> firstPlayer = new ArrayDeque(5);
    private ArrayDeque<Integer> secondPlayer = new ArrayDeque(5);
    private int rounds;

    public Players(){
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Выберите способ заполнения колод \n 1 - Ручной ввод \n 2 - Автоматически \n 3 - Завершение \n");
            int tmp=scanner.nextInt();
            switch (tmp) {
                case 1:
                    userInput();
                    startGame();
                    break;
                case 2:
                    randomInput();
                    startGame();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Введена некорректная команда.");
                    break;
            }
            rounds = 0;

        }
    }

    private void startGame(){
        int firstPlayerCard;
        int secondPlayerCard;
        while (true){
            firstPlayerCard = firstPlayer.pollFirst();
            secondPlayerCard = secondPlayer.pollFirst();
            if (firstPlayerCard > secondPlayerCard){
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            }
            else{
                secondPlayer.add(secondPlayerCard);
                secondPlayer.add(firstPlayerCard);
            }
            rounds++;

            System.out.print("Номер раунда: " + (rounds + 1) + " ");
            System.out.println("игрок №1: " + firstPlayerCard + " игрок №2: " + secondPlayerCard);
            playersDecks();

            if (firstPlayer.isEmpty()){
                System.out.println("second " + rounds);
                firstPlayer.clear();
                secondPlayer.clear();
                return;
            }
            else if (secondPlayer.isEmpty()){
                System.out.println("first " + rounds);
                firstPlayer.clear();
                secondPlayer.clear();
                return;
            }

            if (rounds >= 106){
                System.out.println("botva");
                firstPlayer.clear();
                secondPlayer.clear();
                return;
            }
        }

    }

    private int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        int[] newArray = new int[10];
        System.out.println("Введите колоду первого игрока: ");
        for (int i = 0; i < 5; i++)
            newArray[i] = sc.nextInt();
        System.out.println("Введите колоду второго игрока: ");
        for (int i = 5; i < 10; i++)
            newArray[i] = sc.nextInt();
        return newArray;
    }

    private void userInput(){
        boolean check = false;
        int[] newArray;
        newArray = inputArray();
        for (int i = 0; i < newArray.length; i++){
            if (newArray[i] < 0 || newArray[i] > 9){
                System.out.println("Ошибка.\nНевозможная комбинация карт.\nЗначение карты не может быть меньше 0 или больше 9!\nПовторите ввод");
                check = true;
            }
            for (int j = 0; j < newArray.length; j++)
                if (newArray[i] == newArray[j] && j != i){
                    System.out.println("Ошибка.\nНевозможная комбинация карт.\nКарты не могут повторяться!\nПовторите ввод");
                    check = true;
                    break;
                }
            if (check){
                check = false;
                newArray = inputArray();
                i = -1;
            }
        }
        for (int i = 0; i < 5; i++)
            firstPlayer.add(newArray[i]);
        for (int i = 5; i < 10; i++)
            secondPlayer.add(newArray[i]);
    }

    private void playersDecks(){
        System.out.println("Первый игрок: " + firstPlayer);
        System.out.println("Второй игрок: " + secondPlayer);
    }
    private void randomInput(){
        boolean[] check = new boolean[10];
        int buff;
        int counter = 0;
        while (counter < 10){
            buff = (int)(Math.random() * 10);

            if (!check[buff]){
                check[buff] = true;
                if (counter < 5)
                    firstPlayer.add(buff);
                else
                    secondPlayer.add(buff);
                counter++;

            }
        }
    }
}
