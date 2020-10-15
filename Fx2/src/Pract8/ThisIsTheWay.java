package Pract8;
import com.sun.prism.Graphics;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class ThisIsTheWay {
    public static class GraphicsMain extends JFrame {
        public GraphicsMain(String way) {
            super("simpleApp");
            setSize(700, 600);
            setResizable(false);
            setVisible(true);
            java.awt.Graphics gr;
            Image img;
            img = new ImageIcon(way).getImage();
            gr= getGraphics();
            gr.drawImage(img,0,0,null);

        }
        }

    public static void main(String[] args) {
        Scanner way=new Scanner(System.in);
        GraphicsMain obj=new GraphicsMain(way.nextLine());

    }
}
