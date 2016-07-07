package com.demo;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class StudentView extends PupilView{
    @Override
    public void Hunting(){
        
        frame.setSize(400,300);
        frame.setTitle("Wybór strony monety");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        im = new ImageIcon(new ImageIcon(getClass().getResource("src/main/resources/img/deer.jpg")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        im2 = new ImageIcon(new ImageIcon(getClass().getResource("src/main/resources/img/rabbit.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        frame.setLayout(new FlowLayout());
        
        
        deerButton = new JButton(im);
        rabbitButton = new JButton(im2);

        pan0.add(deerButton);
        pan2.add(rabbitButton);
        mainpan.add(pan0);
        mainpan.add(pan2);
        
        frame.add(mainpan);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
