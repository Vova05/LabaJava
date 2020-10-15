package Pract8;
import com.sun.prism.Graphics;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;
import javax.swing.*;
import java.util.Timer;
public class Animation {
    public static class GraphicsMain extends JFrame {
        public GraphicsMain() {
            super("simpleApp");
            setSize(700, 600);
            setResizable(false);
            setVisible(true);
            java.awt.Graphics gr;
            Image img[]=new Image[3];
            img[0] = new ImageIcon("C:\\Users\\sony\\Desktop\\ИнтернетРесурсы\\Cat.jpg").getImage();
            img[1] = new ImageIcon("C:\\Users\\sony\\Desktop\\ИнтернетРесурсы\\2.jpg").getImage();
            img[2] = new ImageIcon("C:\\Users\\sony\\Desktop\\ИнтернетРесурсы\\bird.jpg").getImage();
            int index=0;
            int index2=0;
            while(true) {
                gr = getGraphics();
                gr.drawImage(img[index], 0, 0, null);
               Timer timer=new Timer();
               timer.schedule(new TimerTask() {
                   @Override
                   public void run() {

                   }
               },2*60*10000
               );
                index++;
                index2++;
                if(index==3){
                    index=0;
                }
                if(index2==300){
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        GraphicsMain obj = new GraphicsMain();
    }
}
