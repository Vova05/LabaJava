package Pract11;

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

public class Root extends Application {
    Group root = new Group();
    private static int change = 0;
    private static int ran = (int) (Math.random() * 20);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Scene sc = new Scene(root, 400, 400);
        stage.setTitle("Play!!!");
        stage.setScene(sc);
        Button a = new Button("Enter");
        TextField enter = new TextField();
        enter.setLayoutX(140);
        enter.setLayoutY(20);
        a.setLayoutX(190);
        a.setLayoutY(45);
        Label exit = new Label();
        exit.setLayoutX(170);
        exit.setLayoutY(70);
        final int[] q = {0};
       /* Button restart=new Button();
        restart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                ran=M
            }
        });*/
        a.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int tmp = Integer.parseInt(enter.getText());
                q[0] = tmp;
                change++;
                if (change < 3) {
                   /*if(q[0] !=ran){
                       exit.setText("Не правильно");
                   }else{
                       exit.setText("Верно ! ! !");
                       ran=(int) (Math.random()*20);
                   }}else{*/
                    if (q[0] != ran) {
                        if (q[0] < ran) {
                            exit.setText("Число меньше загадоного");
                        } else {
                            exit.setText("Число больше загадоного");
                        }
                    } else {
                        exit.setText("Верно ,конец игры");
                        //System.exit(0);
                    }
                }else{
                    exit.setText("Вы проиграли.");
                    System.exit(0);
                }
            }
        });

        System.out.println(ran);
        root.getChildren().addAll(enter, a, exit);
        stage.show();
    }
}
