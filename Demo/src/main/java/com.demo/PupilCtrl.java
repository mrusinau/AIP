package com.demo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class PupilCtrl extends PreschoolerCtrl{
    private PlayerModel theModel;
    private PlayerView theView;
    Random Rand = new Random();
    
    int i = 0;
    
    public PupilCtrl(PlayerModel theModel, PlayerView theView) {
        super(theModel, theView);
        this.theModel=theModel;
        this.theView=theView;
    }
    public void KpN(){      
        theModel.setCh1(Rand.nextInt(3));
        abstract class HT implements ActionListener{}
        HT Listner;
        
        Listner=new HT() {
        @Override
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == theView.paperButton){
                theModel.setCh0(0);
            }
            if(event.getSource() == theView.scissorsButton){
                theModel.setCh1(1);
            }
            if(event.getSource() == theView.fistButton){
                theModel.setCh1(2);
            }
                theModel.records[i][0] = theModel.getCh0();
                theModel.records[i][1] = theModel.getCh1();
            if(theModel.getCh0() == 1 && theModel.getCh1() == 0){
                i++;
                theModel.Win(theModel.getCheck(), -1);
            }
            if(theModel.getCh0() == 0 && theModel.getCh1() == 1){
                i++;
                theModel.Lose(-1);
            }
            if(theModel.getCh0() == 2 && theModel.getCh1() == 1){
                i++;
                theModel.Win(theModel.getCheck(), -1);
            }
            if(theModel.getCh0() == 1 && theModel.getCh1() == 2){
                i++;
                theModel.Lose(-1);
            }
            if(theModel.getCh0() == 0 && theModel.getCh1() == 2){
                i++;
                theModel.Win(theModel.getCheck(), -1);
            }
            if(theModel.getCh0() == 2 && theModel.getCh1() == 0){
                i++;
                theModel.Lose(-1);
            }
            if(theModel.getCh0() == theModel.getCh1()){
                i++;
                theModel.Win(theModel.getCheck(), -1);
            }
            if (i == theModel.reps) {
                        for (int k = 0; k < theModel.reps; k++) {
                            System.out.println(theModel.records[k][0] + "   " + theModel.records[k][1]);
                        }
            }
        }
        };
        theView.fistButton.addActionListener(Listner);
        theView.paperButton.addActionListener(Listner);
        theView.scissorsButton.addActionListener(Listner);
        
    }
}
