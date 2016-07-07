package com.demo;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PreschoolerCtrl extends PlayerCtrl{
    private PlayerModel theModel;
    private PlayerView theView;
    thehandler handler = new thehandler();
    Random Rand = new Random();
    
    
    int i = 0;
    
    public PreschoolerCtrl(PlayerModel theModel, PlayerView theView) {
        super();
        this.theModel=theModel;
        this.theView=theView;
    }
    
    public void Coin(){      
        theModel.setCh1(Rand.nextInt(3));
        abstract class HT implements ActionListener{}
        HT Listner;
        Listner=new HT() {
        public void actionPerformed(ActionEvent event){
        if(event.getSource() == theView.headButton){
                theModel.setCh0(0);
            }
            if(event.getSource() == theView.tailButton){
                theModel.setCh0(1);
            }
            theModel.records[i][0] = theModel.getCh0();
            theModel.records[i][1] = theModel.getCh1();
            if(theModel.getCh0() == theModel.getCh1()){
                theModel.setCheck(0);
                i++;
                theModel.Win(theModel.getCheck(), -1);
            }
            else{
                i++;
                theModel.Lose(-1);
            }
            if (i == theModel.reps) {
                        for (int k = 0; k < theModel.reps; k++) {
                            System.out.println(theModel.records[k][0] + "   " + theModel.records[k][1]);
                        }
            }
        }
        };
        theView.headButton.addActionListener(Listner);
        theView.tailButton.addActionListener(Listner);
        
    }

    public void XO(){
            theView.bu0.addActionListener(handler);
            theView.bu1.addActionListener(handler);
            theView.bu2.addActionListener(handler);
            theView.bu3.addActionListener(handler);
            theView.bu4.addActionListener(handler);
            theView.bu5.addActionListener(handler);
            theView.bu6.addActionListener(handler);
            theView.bu7.addActionListener(handler);
            theView.bu8.addActionListener(handler);
    }

    class thehandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
              
             
            if(event.getSource() == theView.bu0){
                if(theView.bu0.getText().equals("")){
                    if(theModel.getTurn() == true){
                        theView.bu0.setText("X");
                        theModel.setCh0(1);
                        theModel.setTurn(false);
                                                
                    }
                    else {
                        theView.bu0.setText("O");
                        theModel.setCh1(0);
                        theModel.setTurn(true);
                    }
                }
            }
            
            
            if(event.getSource() == theView.bu1){
                if(theView.bu1.getText().equals("")){
                    if(theModel.getTurn() == true){
                        theView.bu1.setText("X");
                        theModel.setCh0(1);
                        theModel.setTurn(false);
                        i++;
                        theModel.records[i][0] = theModel.getCh0();
                    }
                    else {
                        theView.bu1.setText("O");
                        theModel.setCh1(0);
                        theModel.setTurn(true);
                        i++;
                        theModel.records[i][1] = theModel.getCh1();
                    }
                }
            }
            if(event.getSource() == theView.bu2){
                if(theView.bu2.getText().equals("")){
                    if(theModel.getTurn() == true){
                        theView.bu2.setText("X");
                        theModel.setCh0(1);
                        theModel.setTurn(false);
                        i++;
                        theModel.records[i][0] = theModel.getCh0();
                    }
                    else {
                        theView.bu2.setText("O");
                        theModel.setCh1(0);
                        theModel.setTurn(true);
                        i++;
                        theModel.records[i][1] = theModel.getCh1();
                    }
                }
            }
            if(event.getSource() == theView.bu3){
                if(theView.bu3.getText().equals("")){
                    if(theModel.getTurn() == true){
                        theView.bu3.setText("X");
                        theModel.setCh0(1);
                        theModel.setTurn(false);
                        i++;
                        theModel.records[i][0] = theModel.getCh0();
                    }
                    else {
                        theView.bu3.setText("O");
                        theModel.setCh1(0);
                        theModel.setTurn(true);
                        i++;
                        theModel.records[i][1] = theModel.getCh1();
                    }
                }
            }
            if(event.getSource() == theView.bu4){
                if(theView.bu4.getText().equals("")){
                    if(theModel.getTurn() == true){
                        theView.bu4.setText("X");
                        theModel.setCh0(1);
                        theModel.setTurn(false);
                        i++;
                        theModel.records[i][0] = theModel.getCh0();
                    }
                    else {
                        theView.bu4.setText("O");
                        theModel.setCh1(0);
                        theModel.setTurn(true);
                        i++;
                        theModel.records[i][1] = theModel.getCh1();
                    }
                }
            }
            if(event.getSource() == theView.bu5){
                if(theView.bu5.getText().equals("")){
                    if(theModel.getTurn() == true){
                        theView.bu5.setText("X");
                        theModel.setCh0(1);
                        theModel.setTurn(false);
                        i++;
                        theModel.records[i][0] = theModel.getCh0();
                    }
                    else {
                        theView.bu5.setText("O");
                        theModel.setCh1(0);
                        theModel.setTurn(true);
                        i++;
                        theModel.records[i][1] = theModel.getCh1();
                    }
                }
            }
            if(event.getSource() == theView.bu6){
                if(theView.bu6.getText().equals("")){
                    if(theModel.getTurn() == true){
                        theView.bu6.setText("X");
                        theModel.setCh0(1);
                        theModel.setTurn(false);
                        i++;
                        theModel.records[i][0] = theModel.getCh0();
                    }
                    else {
                        theView.bu6.setText("O");
                        theModel.setCh1(0);
                        theModel.setTurn(true);
                        i++;
                        theModel.records[i][1] = theModel.getCh1();
                    }
                }
            }
            if(event.getSource() == theView.bu7){
                if(theView.bu7.getText().equals("")){
                    if(theModel.getTurn() == true){
                        theView.bu7.setText("X");
                        theModel.setCh0(1);
                        theModel.setTurn(false);
                        i++;
                        theModel.records[i][0] = theModel.getCh0();
                    }
                    else {
                        theView.bu7.setText("O");
                        theModel.setCh1(0);
                        theModel.setTurn(true);
                        i++;
                        theModel.records[i][1] = theModel.getCh1();
                    }
                }
            }
            if(event.getSource() == theView.bu8){
                if(theView.bu8.getText().equals("")){
                    if(theModel.getTurn() == true){
                        theView.bu8.setText("X");
                        theModel.setCh0(1);
                        theModel.setTurn(false);
                        i++;
                        theModel.records[i][0] = theModel.getCh0();
                    }
                    else {
                        theView.bu8.setText("O");
                        theModel.setCh1(1);
                        theModel.setTurn(true);
                        i++;
                        theModel.records[i][1] = theModel.getCh1();
                    }
                }
            }
            if (i == theModel.reps) {
                        for (int k = 0; k < theModel.reps; k++) {
                            System.out.println(theModel.records[k][0] + "   " + theModel.records[k][1]);
                        }
            }
            WhoIsBest();
            }
        }
    public void WhoIsBest() {

            if (theView.bu0.getText().equals("X") && theView.bu1.getText().equals("X") && theView.bu2.getText().equals("X")){         
                     theModel.Win(0, -1);
                     theModel.setWin(true);
            }
            if (theView.bu3.getText().equals("X") && theView.bu4.getText().equals("X") && theView.bu5.getText().equals("X")){                             
                     theModel.Win(0, -1);
                     theModel.setWin(true);
            }
            if (theView.bu6.getText().equals("X") && theView.bu7.getText().equals("X") && theView.bu8.getText().equals("X")){                             //[1[{2,3}, {5,9}, {4,7}]]
                     theModel.Win(0, -1);
                     theModel.setWin(true);
            }
            if (theView.bu1.getText().equals("X") && theView.bu4.getText().equals("X") && theView.bu7.getText().equals("X")){                             //[1[{2,3}, {5,9}, {4,7}]]
                     theModel.Win(0, -1);
                     theModel.setWin(true);
            }
            if (theView.bu2.getText().equals("X") && theView.bu5.getText().equals("X") && theView.bu8.getText().equals("X")){                             //[1[{2,3}, {5,9}, {4,7}]]
                     theModel.Win(0, -1);
                     theModel.setWin(true);
            }
            if (theView.bu0.getText().equals("X") && theView.bu4.getText().equals("X") && theView.bu8.getText().equals("X")){                             //[1[{2,3}, {5,9}, {4,7}]]
                     theModel.Win(0, -1);
                     theModel.setWin(true);
            }
            if (theView.bu2.getText().equals("X") && theView.bu4.getText().equals("X") && theView.bu6.getText().equals("X")){                             //[1[{2,3}, {5,9}, {4,7}]]
                     theModel.Win(0, -1);
                     theModel.setWin(true);
            }
            
            ////////////////////////////////////////////////////////////////////
            if (theView.bu0.getText().equals("O") && theView.bu1.getText().equals("O") && theView.bu2.getText().equals("O")){         
                     theModel.Lose(1);
                     theModel.setWin(true);
            }
            if (theView.bu3.getText().equals("O") && theView.bu4.getText().equals("O") && theView.bu5.getText().equals("O")){                             
                     theModel.Lose(1);
                     theModel.setWin(true);
            }
            if (theView.bu6.getText().equals("O") && theView.bu7.getText().equals("O") && theView.bu8.getText().equals("O")){                             //[1[{2,3}, {5,9}, {4,7}]]
                     theModel.Lose(1);
                     theModel.setWin(true);
            }
            if (theView.bu1.getText().equals("O") && theView.bu4.getText().equals("O") && theView.bu7.getText().equals("O")){                             //[1[{2,3}, {5,9}, {4,7}]]
                     theModel.Lose(1);
                     theModel.setWin(true);
            }
            if (theView.bu2.getText().equals("O") && theView.bu5.getText().equals("O") && theView.bu8.getText().equals("O")){                             //[1[{2,3}, {5,9}, {4,7}]]
                     theModel.Lose(1);
                     theModel.setWin(true);
            }
            if (theView.bu0.getText().equals("O") && theView.bu4.getText().equals("O") && theView.bu8.getText().equals("O")){                             //[1[{2,3}, {5,9}, {4,7}]]
                     theModel.Lose(1);
                     theModel.setWin(true);
            }
            if (theView.bu2.getText().equals("O") && theView.bu4.getText().equals("O") && theView.bu6.getText().equals("O")){                             //[1[{2,3}, {5,9}, {4,7}]]
                     theModel.Lose(1);
                     theModel.setWin(true);
            }
            if(theModel.getWin() == true){
                theView.frame.setVisible(false);
                //System.exit(0);
            }
        
    }
    }


