package Pract17;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.awt.*;

public class Character extends Pane{
    public int victory =0;
    public int colVictory=0;
    ImageView imageView;
    int count = 3;
    int columns = 3;
    int offsetX = 0;
    int offsetY = 0;
    int width = 32;
    int height = 32;
    int score = 0;
    Rectangle removeRect = null;
    SpriteAnimation animation;
    public Character(ImageView imageView){
        this.imageView = imageView;
        Label a=new Label();
        this.imageView.setViewport(new Rectangle2D(offsetX,offsetY,width,height));
        animation = new SpriteAnimation(imageView,Duration.millis(200),count,columns,offsetX,offsetY,width,height);
        getChildren().addAll(imageView);
    }
    public void moveX(int x){
        boolean right = x>0?true:false;
        for(int i = 0; i < Math.abs(x); i++) {
            if (right) this.setTranslateX(this.getTranslateX() + 1);
            else this.setTranslateX(this.getTranslateX() - 1);
            isBonuseEat();
        }
    }
    public void moveY(int y) {
        boolean down = y > 0 ? true : false;
        for (int i = 0; i < Math.abs(y); i++) {
            if (down) this.setTranslateY(this.getTranslateY() + 1);
            else this.setTranslateY(this.getTranslateY() - 1);
            isBonuseEat();
        }
    }
    public void isBonuseEat(){
        Root.bonuses.forEach((rect) -> {
            if (this.getBoundsInParent().intersects(rect.getBoundsInParent())) {
                removeRect = rect;
                //score++;
                victory++;
                System.out.println(victory);
                if(victory==10){
                    colVictory++;
                    Root.status="Victory "+colVictory;
                   // System.out.println("<<<Victory>>>");
                    victory=0;
                }
            }


        });
        Root.deadBonuses.forEach((rect)->{
            if(this.getBoundsInParent().intersects(rect.getBoundsInParent())){
                removeRect = rect;
                victory--;
                System.out.println(victory);
                if(victory<0){
                    Root.status="Dead";
                    //System.out.println("<<<Dead>>>");
                    victory=0;
                }
            }
        });
        Root.flyDeadBonuses.forEach((rect)->{
            rect.setX(rect.getX()-5);
            if(this.getBoundsInParent().intersects(rect.getBoundsInParent())){
                removeRect = rect;
                victory--;
                System.out.println(victory);
                if(victory<0){
                    Root.status="Dead";
                    //System.out.println("<<<Dead>>>");
                    victory=0;
                }
            }
        });
        Root.flyDeadBonuses.remove(removeRect);
        Root.bonuses.remove(removeRect);
        Root.deadBonuses.remove(removeRect);
        Root.root.getChildren().remove(removeRect);
    }
    public int getVictory(){
        return victory;
    }
}
