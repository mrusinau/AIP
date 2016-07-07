package com.demo;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PreschoolerView extends PlayerView{

    public void XO() {
                frame.setSize(300,300);
                frame.setTitle("Krzyżyk i kółko");
		frame.setResizable(false);
               
                pan0.setLayout(new GridLayout(3,3));
                frame.setLocationRelativeTo(null);
                
                bu0.setText("");
                bu1.setText("");
                bu2.setText("");
                bu3.setText("");
                bu4.setText("");
                bu5.setText("");
                bu6.setText("");
                bu7.setText("");
                bu8.setText("");
		
		
                pan0.add(bu0);
                pan0.add(bu1);
                pan0.add(bu2);
                pan0.add(bu3);
                pan0.add(bu4);
                pan0.add(bu5);
                pan0.add(bu6);
                pan0.add(bu7);
                pan0.add(bu8);
                
                frame.add(pan0);
                
                frame.setVisible(true);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void Coin(){
        
        frame.setSize(400,300);
        frame.setTitle("Wybór strony monety");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        im = new ImageIcon(new ImageIcon(getClass().getResource("src/main/resources/img/head.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        im2 = new ImageIcon(new ImageIcon(getClass().getResource("src/main/resources/img/tail.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        
        frame.setLayout(new FlowLayout());
        
        
        headButton = new JButton(im);
        tailButton = new JButton(im2);

        pan0.add(headButton);
        pan2.add(tailButton);
        mainpan.add(pan0);
        mainpan.add(pan2);
        frame.add(mainpan);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
