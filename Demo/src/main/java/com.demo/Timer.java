package com.demo;
import javax.swing.*;

/**
 * Created by Alex on 21.4.16.
 */
public class Timer extends Thread{

    protected int time = 0, minutes, sec;
    int stimeout;
    PlayerView theView;
    public Timer(PlayerModel theModel, PlayerView theView){
        stimeout = theModel.limit;
        this.theView = theView;
    }
    public int ret(){
        return stimeout;
    }
    public void run() {
        while (true) {
            try {
                this.sleep(1000);
            } catch (InterruptedException exc) {
                System.out.println("Watek zliczania czasu zoostal‚ przerwany.");
                return;
            }
            time++;
            minutes = time / 60;
            sec = time % 60;
            if(sec == stimeout){
                JOptionPane.showMessageDialog(null,"Predrales, uzytkowniko");
                System.exit(0);
            }
        }
    }
    void GetTime(){
        System.out.println(minutes + ":" + sec);
    }
}
