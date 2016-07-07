package com.demo;
import javax.swing.*;

public abstract class PlayerView {
    JButton headButton;
    JButton tailButton;
    JButton fistButton;
    JButton paperButton;
    JButton scissorsButton;
    JButton deerButton;
    JButton rabbitButton;
    ImageIcon im, im2, im3;
    
    JPanel mainpan = new JPanel();
    JPanel pan0 = new JPanel();
    JPanel pan2 = new JPanel();
    JPanel pan3 = new JPanel();
    
    JButton bu0 = new JButton();
    JButton bu1 = new JButton();
    JButton bu2 = new JButton();
    JButton bu3 = new JButton();
    JButton bu4 = new JButton();
    JButton bu5 = new JButton();
    JButton bu6 = new JButton();
    JButton bu7 = new JButton();
    JButton bu8 = new JButton();
    
    JFrame frame = new JFrame();
    
    public abstract void Coin();
    public abstract void XO();
    public void Hunting(){}
    public void KpN(){}
    
}
