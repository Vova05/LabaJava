package Pract12;
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

import java.net.Proxy;

public class Root12 extends Application {
    Group root = new Group();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
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
                String tmpS=enter.getText();
                TypeClass.Planets st= TypeClass.Planets.Define;
                try {
                     st = TypeClass.Planets.valueOf(tmpS);
                }catch (Exception e) {if (e.getCause() instanceof NumberFormatException) {
                    st= TypeClass.Planets.Define;
                } else if (e.getCause() instanceof IllegalArgumentException) {
                    st = TypeClass.Planets.Define;
                }
                }

                switch (st.name()){
                    case ("Define"):{
                        exit.setText("There is no such planet");
                        break;
                    }
                    case ("MERCURY"):{
                        TypeClass obj=new TypeClass(3.3*Math.pow(10,23),4.87*1000);
                        exit.setText("Mercury \ng = "+ obj.g);
                        break;
                    }
                    case ("VENUSIAN"):{
                        TypeClass obj=new TypeClass(4.87*Math.pow(10,24),12.1*1000);
                        exit.setText("Venusian \ng = "+obj.g);
                        break;
                    }
                    case ("EARTH"):{
                        TypeClass obj=new TypeClass(5.976*Math.pow(10,24),12.756*1000);
                        exit.setText("Earth \ng = "+obj.g);
                        break;
                    }
                    case ("MARS"):{
                        TypeClass obj=new TypeClass(6.4*Math.pow(10,23),6.67*1000);
                        exit.setText("Mars \ng = "+obj.g);
                        break;
                    }
                    case ("JUPITER"):{
                        TypeClass obj=new TypeClass(1.9*Math.pow(10,27),143.76*1000);
                        exit.setText("Jupiter \ng = "+obj.g);
                        break;
                    }
                    case ("SATURN"):{
                        TypeClass obj=new TypeClass(5.68*Math.pow(10,26),120.42*1000);
                        exit.setText("Saturn \ng = "+obj.g);
                        break;
                    }
                    case ("URANIUM"):{
                        TypeClass obj=new TypeClass(8.7*Math.pow(10,25),51.3*1000);
                        exit.setText("Uranium \ng = "+obj.g);
                        break;
                    }
                    case ("NEPTUNE"):{
                        TypeClass obj=new TypeClass(1*Math.pow(10,26),49.5*1000);
                        exit.setText("Neptune \ng = "+obj.g);
                        break;
                    }
                }

            }
        });
        root.getChildren().addAll(enter, a, exit,exit0,exit1);
        stage.show();
    }
}
