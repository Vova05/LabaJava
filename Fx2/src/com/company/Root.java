package com.company;

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
import java.util.LinkedList;
import java.io.*;
import java.io.FileWriter;
import java.io.FileInputStream;

public class Root extends Application{

        public static void main(String[] args) {

            Application.launch(args);
        }

        int number;
    Group root=new Group();
    final private int WIDTH = 400;
    final private int HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) throws Exception {

        LinkedList<String> list=new LinkedList<String>();

        Scene scene=new Scene(root,WIDTH,HEIGHT);
        primaryStage.setTitle("LinkidList.");
        primaryStage.setScene(scene);
        TextField enter;
        enter=new TextField();

        TextField exit;
        Label exitUp;
        exit=new TextField("Print");
        Button ent=new Button("Enter");

        Button extFirst=new Button("Print first");
        Button ext=new Button("Print");
        Button entFirst=new Button("Enter first");
        Button writeFile=new Button("Write list to file");

        TextArea tx=new TextArea();
        ent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                list.add(enter.getText());
                enter.clear();
            }
        });
        ext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(list.size()>0) {
                    exit.setText(list.getLast());
                    list.removeLast();
                }else{
                    exit.setText("List end!!!");
                }
            }
        });

        extFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(list.size()>0){
                exit.setText(list.getFirst());
                }else{
                    exit.setText("List empty!!!");
                }
            }
        });
        entFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                list.addFirst(enter.getText());
                enter.clear();
            }
        });
        writeFile.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String tmp="Written to the file:"+"\n";
                for(int i=0;i<list.size();i++){
                    try {
                        fileWrite(list.get(i));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    tmp+=list.get(i)+"\n";
                }
                tx.setText(tmp);
            }
        });
        ext.setMinSize(10,10);
        ent.setMinSize(10,10);
        ent.setLayoutY(30);
        exit.setLayoutX(50);
        enter.setLayoutY(30);
        enter.setLayoutX(50);

        entFirst.setLayoutX(210);
        entFirst.setLayoutY(30);
        extFirst.setLayoutX(210);
        tx.setLayoutY(60);
        tx.setMaxSize(275,300);
        writeFile.setLayoutY(275);
        root.getChildren().addAll(ent,ext,enter,exit,extFirst,entFirst,tx,writeFile);
        primaryStage.show();
    }
    public void fileWrite(String tx) throws IOException {
        File fl=new File("C:\\Users\\sony\\Desktop\\ALLjava\\Fx2\\src\\WriteFile.txt");
       try{
          BufferedWriter bf=new BufferedWriter(new FileWriter(fl,true));
          bf.write(tx+"\n");
          bf.flush();
          bf.close();
       }catch (IOException ex){
           System.out.println(ex.getMessage());
       }
    }


}
