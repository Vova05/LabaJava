package Pract9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Root extends JFrame {
    Root() {
         setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
         JPanel pl=new JPanel();
         JButton bt=new JButton("Change");
         ActionListener obj=new Action();
         bt.addActionListener(obj);
         pl.add(bt);
         pl.setVisible(true);
         pl.setSize(400,400);
         this.add(pl);
         bt.setVisible(true);
         bt.setSize(100,50);

    }

    public static void main(String[] args) {
        Root obj=new Root();
        obj.setVisible(true);
        obj.setSize(400,400);
    }

}
