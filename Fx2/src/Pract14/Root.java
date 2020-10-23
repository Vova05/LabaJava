package Pract14;
import Pract12.TypeClass;
import Pract13.*;
import Pract13.Student;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Transform;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

import javax.naming.directory.SearchControls;
import java.util.Arrays;
import java.util.Scanner;

public class Root {
    Group root = new Group();
    public static void main(String[] args) {
        //launch(args);
        Scanner sc=new Scanner(System.in);
//        while (true){
//            int tmp=sc.nextInt();
//            if(tmp==0){
//                break;
//            }
//            int arr[]=retArray(tmp);
//            System.out.println(Arrays.toString(arr));
//        }
        while (true){
            int tmp=sc.nextInt();
            System.out.println("---");
            if(tmp==0){
                break;
            }
            int tmp2=sc.nextInt();
            System.out.println("---");
            int arr[]=retArray(tmp);
            Search obj1=new Search();
            switch (tmp){
                case 1:{
                    System.out.println(obj1.binarySearch(arr,tmp2));
                    break;
                }
                case 2:{
                    System.out.println(obj1.recursiveBinarySearch(arr,arr[0],arr[arr.length-1],tmp2));
                    break;
                }
                case 3:{
                    if(arr!=null)
                    System.out.println(obj1.lineSearch(arr,tmp2));
                    break;
                }
                case 4:{
                    if(arr!=null)
                    System.out.println(obj1.lineRecSearch(arr,tmp2,0));
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }

    /*@Override
    public void start(Stage stage) throws Exception {
        Scene sc = new Scene(root, 500, 400);
        stage.setTitle("Planets.");
        stage.setScene(sc);
        Button a = new Button("Enter");
        TextField enter = new TextField();
        TextField enter1=new TextField();
        enter1.setLayoutX(140);
        enter1.setLayoutY(45);
        enter.setLayoutX(140);
        enter.setLayoutY(20);
        a.setLayoutX(190);
        a.setLayoutY(75);
        Label exit0=new Label();
        Label exit1=new Label();
        exit1.setLayoutX(350);
        exit1.setLayoutY(20);
        exit0.setLayoutX(10);
        exit0.setLayoutY(20);
        exit0.setText("Введите название \nпланеты в формате \n'MERCURY'" +
                "\n И нажмите Enter. \n");
        exit1.setText("Планеты в списке"+"\nMercury"
                +"\nVenusian"
                +"\nEarth"
                +"\nMars"
                +"\nJupiter"
                +"\nSaturn"
                +"\nUranium"
                +"\nNeptune");
        Label exit = new Label();
        exit.setLayoutX(170);
        exit.setLayoutY(100);
        final int[] q = {0};

        a.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
        root.getChildren().addAll(enter, a, exit,exit0,exit1);
        stage.show();
    }*/
    public static int[] retArray(int num){
        Sort obj=new Sort();
        Pract13.Root a=new Pract13.Root();
        a.main();
        int[] array=a.getArray();
        switch (num){
            case 1:{
                obj.quickSort(array,0,array.length-1);
                return array;}
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
        //int[] array2=a.getArray();
            case 2: {obj.mergesort(array);
                    return array;}
            default: {
                return null;
            }
        }
//        System.out.println("-------------------------------------");
//        for(int i=0;i<array.length;i++){
//            System.out.println(array2[i]);
//        }
    }
}
