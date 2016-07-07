package com.demo;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PupilView extends PreschoolerView{
    @Override
    public void KpN(){
        
        frame.setSize(400,300);
        frame.setTitle("Wybór strony monety");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        im = new ImageIcon(new ImageIcon(getClass().getResource("src/main/resources/img/paper.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        im2 = new ImageIcon(new ImageIcon(getClass().getResource("src/main/resources/img/scissors.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        im3 = new ImageIcon(new ImageIcon(getClass().getResource("src/main/resources/img/fist.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        frame.setLayout(new FlowLayout());
        
        
        fistButton = new JButton(im);
        paperButton = new JButton(im2);
        scissorsButton = new JButton(im3);

        pan0.add(fistButton);
        pan2.add(paperButton);
        pan3.add(scissorsButton);
        mainpan.add(pan0);
        mainpan.add(pan2);
        mainpan.add(pan3);
        
        frame.add(mainpan);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
