 package com.company;
 import com.sun.scenario.effect.Effect;
 import com.sun.scenario.effect.Glow;
 import javafx.application.Application;
 import javafx.scene.*;
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
 import javafx.scene.transform.Transform;
 import javafx.stage.*;
 import javafx.scene.layout.*;
 import javafx.scene.control.*;
 import javafx.event.*;
 import javafx.geometry.*;

 import java.io.FileInputStream;

 public class Test extends Application {

     TextField tf;
     Label response;
     ImageView img;
     public static void main(String[] args) {
         launch(args);
     }

     @Override
     public void start(Stage myStage) throws Exception {
         myStage.setTitle("Demonstrate а TextField");
         FlowPane rootNode =  new  FlowPane(10, 10);
         rootNode.setAlignment(Pos.CENTER);
         Scene myScene =  new  Scene(rootNode, 400, 400);
         myStage.setScene(myScene);
         response =  new  Label("Enter Narne: ");
         //Button btnGetText =  new  Button("Get Narne");
         Button reload=new Button("Push new photo");
         reload.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent actionEvent) {
                 if(tf.getText()!=""){
                     try {
                         img=ImgCl1(tf.getText());
                         rootNode.getChildren().add(img);
                         rootNode.getChildren().remove(rootNode.getChildren().size()-2,rootNode.getChildren().size()-1);
                     } catch (Exception e) {
                         e.printStackTrace();
                     }
                 }
             }
         });
         tf  =  new  TextField();

         String fileName="C:/Users/sony/Desktop/Retriver.jpg";
                 // "C:/Users/sony/Desktop/ALLjava/Fx2/Husky.jpg";

         response.setText("");
         //tf.setOnAction( (ае) ->  response.setText(tf. getText () ) ) ;

         //btnGetText.setOnAction(new EventHandler<ActionEvent>() {});

         img = ImgCl1(fileName);
         Separator separator =  new  Separator();
         separator.setPrefWidth(180);

         rootNode.getChildren().addAll(tf,separator, response,reload,img);
         myStage.show();
     }

     public ImageView ImgCl1(String imgFile) throws Exception{
         Image img=new Image(new FileInputStream(imgFile));
         ImageView imgV=new ImageView(img);
         imgV.setFitHeight(200);
         imgV.setFitWidth(150);
         imgV.setLayoutX(250);
         return imgV;
     }
 }
