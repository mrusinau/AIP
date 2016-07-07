package com.demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
    private Model theModel;
    private View theView;
    thehandler handler = new thehandler();
    public Controller(Model theModel, View theView){
        this.theModel = theModel;
        this.theView = theView;
    }
    
    
    public void ctrl(){
        theView.newGame.addActionListener(handler);
        theView.about.addActionListener(handler);
        theView.exit.addActionListener(handler);
        theView.NoBack.addActionListener(handler);
        theView.Go.addActionListener(handler);
        theView.g1.addActionListener(handler);
        theView.g2.addActionListener(handler);
        theView.g3.addActionListener(handler);
        theView.g4.addActionListener(handler);
        theView.select.addActionListener(handler);
        theView.reps.addActionListener(handler);
    }   
    
    public PlayerModel modele(int i){
        PlayerModel thePlayerModel = null;
        if(i == 0){
            thePlayerModel = new PreschoolerModel(theModel.getName(), theModel.getSurname());
        }
        if(i == 1){
            thePlayerModel = new PupilModel(theModel.getName(), theModel.getSurname());
        }
        if(i == 2){
            thePlayerModel = new StudentModel(theModel.getName(), theModel.getSurname());
        }
        return thePlayerModel;
    }
    
    public PlayerView Vie(int i){
        PlayerView thePlayerVie = null;
        if(i == 0){
            thePlayerVie = new PreschoolerView();
        }
        if(i == 1){
            thePlayerVie = new PupilView();
        }
        if(i == 2){
            thePlayerVie = new StudentView();
        }
        return thePlayerVie;
    }
    
    public PlayerCtrl kontrole(int i, PlayerModel thePlayerModel, PlayerView thePlayerVie){
        PlayerCtrl thePlayerCtrl = null;
        if(i == 0){
            thePlayerCtrl = new PreschoolerCtrl(thePlayerModel, thePlayerVie);
        }
        if(i == 1){
            thePlayerCtrl = new PupilCtrl(thePlayerModel, thePlayerVie);
        }
        if(i == 2){
            thePlayerCtrl = new StudentCtrl(thePlayerModel, thePlayerVie);
        }
        return thePlayerCtrl;
    }
    
    
    
    class thehandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == theView.exit){
                System.exit(0);
            }
            if(event.getSource() == theView.about){
                JOptionPane.showMessageDialog(null, "Projekt zaliczeniowy z przedmiotu 'programowanie w języku Java'\nBy: Rusinau Maksim, versja 0.jakas");
            }
            if(event.getSource() == theView.newGame){
                JOptionPane.showMessageDialog(null,"Zaczynam nową grę...");
            }
            if(event.getSource() == theView.NoBack){
                
                JOptionPane.showMessageDialog(null,"Wanna exit?..");
                System.exit(0);
            }
            if (event.getSource() == theView.select) {
                if (theView.select.getSelectedIndex() == 0) {
                    theView.g2.setEnabled(false);
                    theView.g3.setEnabled(false);
                }
                if (theView.select.getSelectedIndex() == 1) {
                    theView.g2.setEnabled(true);
                    theView.g3.setEnabled(false);
                }
                if (theView.select.getSelectedIndex() == 2) {
                    theView.g2.setEnabled(true);
                    theView.g3.setEnabled(true);
                }
            }
            if(event.getSource() == theView.g1){
                
                    theModel.setGame(0);
            }
            if(event.getSource() == theView.g2){
                
                    theModel.setGame(1);
            }
            if(event.getSource() == theView.g3){
                
                    theModel.setGame(2);
            }
            if(event.getSource() == theView.g4){
                
                    theModel.setGame(3);
            }
            if(event.getSource() == theView.Go){
              
                if(theModel.getGamer()==0){
                    theModel.Gamer = new PreschoolerModel(theModel.getName(), theModel.getSurname());
                }
                if(theModel.getGamer()==1){
                    theModel.Gamer = new PupilModel(theModel.getName(), theModel.getSurname());
                }
                if(theModel.getGamer()==2){
                    theModel.Gamer = new StudentModel(theModel.getName(), theModel.getSurname());
                }
                
                try {
                    
                    theModel.setName(theView.imie.getText());
                    theModel.setSurname(theView.nazw.getText());
                    theModel.setRund(Integer.parseInt((String)theView.reps.getSelectedItem()));
                    theModel.setPoint(2);
                    
                    PlayerModel pl = modele(theModel.getGamer());
                    PlayerView theVie = Vie(theModel.getGamer());
                    PlayerCtrl Ctr = kontrole(theModel.getGamer(),pl, theVie);
                    for(int i = 0; i <= theModel.getRund(); i++){
                        if(theModel.getGame() == 0){
                            theVie.Coin();
                            Ctr.Coin();
                        }
                        if(theModel.getGame() == 1){
                            theVie.KpN();
                            Ctr.KpN();
                        }
                        if(theModel.getGame() == 2){
                            theVie.Hunting();
                            Ctr.Hunting();
                        }
                        if(theModel.getGame() == 3){
                            theVie.XO();
                            Ctr.XO();
                        }           
                    }
                }
                catch (Exception err){
                    JOptionPane.showMessageDialog(null, "err!");
                };
                
            }
        }
    }
    
}
