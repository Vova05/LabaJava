package Pract8;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Random;
import javax.swing.JFrame;
public class Root {
    public static class GraphicsMain extends JFrame {

        public GraphicsMain() {
            super("simpleApp");
            setSize(700, 600);
            setVisible(true);
        }

        @Override
        public void paint(Graphics g) {

            Graphics2D gr2d = (Graphics2D) g;
            gr2d.setBackground(Color.green);
            for(int index=0;index<4;index++){
                for(int index2=0;index2<5;index2++){
                    int tmp1=(int)(Math.random()*2);
                    Color obj=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));

                    switch (tmp1) {
                        case 0: {
                            gr2d.setPaint(obj);
                            gr2d.fillRect(50 * (index + 1), 40 * (index2 + 1), 20, 20);
                            break;
                        }
                        case 1: {
                            gr2d.setPaint(obj);
                            gr2d.fillOval(50 * (index + 1), 40 * (index2 + 1), 20, 20);
                            break;
                        }
                }
                }
            }
        }
    }
    public static void main(String[] args) {
        GraphicsMain app=new GraphicsMain();
    }
}
