package com.demo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class View {
    public String[] labels = {"Imie", "Nazwisko", "", ""};
    public     String[] Types = { "Przedszkolak", "Uczeń", "Student"};
    public    String[] Games = { "Moneta", "KpN", "Polowanie", "XO"};
    public String numerals[] = {"0", "1", "2", "3", "4"};
    public int gamer;
    static JFrame frame;
    public JPanel mainPanel;
    public JPanel InfPan, GamPan, ButtPan;
    public JPanel pl, pl2, pl3;
    public JComboBox select, reps, pts;
    public JMenu File;
    public JMenuItem newGame, exit, about;
    public JMenuBar MenuBar;
    public JRadioButton g1= new JRadioButton(Games[0]);
    public JRadioButton g2= new JRadioButton(Games[1]);
    public JRadioButton g3= new JRadioButton(Games[2]);
    public JRadioButton g4= new JRadioButton(Games[3]);
    public JButton NoBack = new JButton("Back!"); 
    public JButton Go = new JButton("Launch");
        
    public JTextField imie, nazw;
    
    public int game = -1;

    
    

    public void mView(){
        
        frame = new JFrame(" ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        File = new JMenu("File");
        menuBar.add(File);
        newGame = new JMenuItem("New Game");
        exit = new JMenuItem("Exit");
        about = new JMenuItem("About");
        File.add(newGame); 
        File.addSeparator();
        File.add(about); 
        File.addSeparator();
        File.add(exit);

        mainPanel = new JPanel();
        InfPan = new JPanel(); GamPan = new JPanel(); ButtPan = new JPanel();
        
       
        InfPan.setLayout(new BoxLayout(InfPan, BoxLayout.LINE_AXIS));
        
        GamPan.setLayout(new BoxLayout(GamPan, BoxLayout.Y_AXIS));
       
        InfPan.setLayout(new FlowLayout());
        Go.setPreferredSize(new Dimension(100,40));
        NoBack.setPreferredSize(new Dimension(100,40));
        NoBack.setLayout(null);
        
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(g1);
        bgroup.add(g2);
        bgroup.add(g3);
        bgroup.add(g4);
        
        
        select = new JComboBox(Types);
        reps = new JComboBox(numerals);
        select.setSelectedIndex(0);
        
   
        imie = new JTextField(6);
        nazw = new JTextField(6);
        
        
        for(int i=0; i<4;i++){
            JLabel label = new JLabel(labels[i]);
            if (i<2)
                InfPan.add(label);
            switch(i){
                
                case 0:
                    InfPan.add(nazw);
                    break;
                case 1:
                    InfPan.add(imie);
                    break;
                case 2:
                    InfPan.add(reps);
                    InfPan.add(select);
                    break;
                case 3:
                    GamPan.add(g1);
                    GamPan.add(g2);
                    GamPan.add(g3);
                    GamPan.add(g4);
                    g1.setSelected(true);
                    g2.setEnabled(false);
                    g3.setEnabled(false);
                    ButtPan.add(Go);
                    ButtPan.add(NoBack);
                    
                    break;
            
            }
        }
        
        
        mainPanel.add(InfPan); mainPanel.add(GamPan); mainPanel.add(ButtPan);
        frame.add(mainPanel);
        
        frame.setVisible(true);
        mainPanel.setVisible(true);
        
    }
    
}
