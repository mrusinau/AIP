package com.demo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class StudentCtrl extends PupilCtrl{
    private PlayerModel theModel;
    private PlayerView theView;
    Random Rand = new Random();
    int i = 0;
    int[][] records = new int[9][2];
    public StudentCtrl(PlayerModel theModel, PlayerView theView){
        super(theModel, theView);
        this.theModel = theModel;
        this.theView = theView;
    }
    public void Hunting(){      
        theModel.setCh1(Rand.nextInt(2));
        abstract class HT implements ActionListener{}
        HT Listner;
        
        Listner=new HT() {
        @Override
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == theView.deerButton){
                theModel.setCh0(0);
            }
            if(event.getSource() == theView.rabbitButton){
                theModel.setCh1(1);
            }
                theModel.records[i][0] = theModel.getCh0();
                theModel.records[i][1] = theModel.getCh1();
            if(theModel.getCh0() == 0 && theModel.getCh1() == 0){
                i++;
                theModel.setCheck(-2);
                theModel.Win(theModel.getCheck(), -1);
            }
            if(theModel.getCh0() == 0 && theModel.getCh1() == 1){
                i++;
                theModel.Lose(-1);
            }
            if(theModel.getCh0() == 1 && theModel.getCh1() == 1){
                i++;
                theModel.setCheck(-1);
                theModel.Win(theModel.getCheck(), -1);
            }
            if(theModel.getCh0() == 1 && theModel.getCh1() == 0){
                i++;
                theModel.Win(theModel.check, -1);
            }
            
            if (i == theModel.reps) {
                        for (int k = 0; k < theModel.reps; k++) {
                            System.out.println(theModel.records[k][0] + "   " + theModel.records[k][1]);
                        }
            }
        }
        };
        theView.deerButton.addActionListener(Listner);
        theView.rabbitButton.addActionListener(Listner);
        
    }
}
