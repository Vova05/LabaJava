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

import java.io.FileInputStream;

public class Menu extends Application {


    public static void main(String[] args) {
        launch(args);
    }
    Group root=new Group();
    final private int WIDTH = 400;
    final private int HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene=new Scene(root,WIDTH,HEIGHT);
        primaryStage.setTitle("Play!!!");
        primaryStage.setScene(scene);
        Button array[]=new Button[5];
        for(int i=0;i<5;i++){
            array[i]=new Button("");
            sizeButton(array[i]);
        }
        int sum=41;
       array[0].setLayoutX(sum);
        array[1].setLayoutY(sum);
        array[2].setLayoutX(sum);
        array[2].setLayoutY(sum);
        array[3].setLayoutX(sum*2);
        array[3].setLayoutY(sum);
        array[4].setLayoutX(sum);
        array[4].setLayoutY(sum*2);
        Label lb=new Label("defolt");
        lb.setLayoutX(sum*3);
        lb.setLayoutY(20);
        lb.setEffect(new Glow());


        array[0].setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lb.setText("a");
            }
        } );
        array[1].setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lb.setText("b");
            }
        });
        array[2].setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lb.setText("c");
            }
        });
        array[3].setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lb.setText("d");
            }
        });
        array[4].setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lb.setText("e");
            }
        });


        root.getChildren().addAll(lb,array[0],array[1],array[2],array[3],array[4]);
        primaryStage.show();

    }

    public void sizeButton(Button x){
        x.setMinHeight(40);
        x.setMinWidth(40);
    }

}
