package com.demo;
import java.util.Scanner;
import java.lang.String;
import javax.swing.JOptionPane;
import java.util.Random;

public abstract class PlayerModel implements Lost_interf, Won_interf{
    
    protected int reps, rund;
    protected int point = 5;
    protected int Money = 10;
    protected String Type = "";
    protected int ch1, ch0, check;
    public static boolean win = false;
    public static boolean turn = true;
    public int limit;
    
    public int[][] records = new int[9][2];
    PlayerModel(){}
    public int PointsPlus() {
        return Money += point;
    }
    public int PointsMinus() {
        return Money -= point;
    }
    public void setRund(int rund){
        Random rand  = new Random();
        this.rund = rand.nextInt(rund + 1);
    }
    public int getPoint(){
        return point;
    }
    public int getRund(){
        Random rand  = new Random();
        return rand.nextInt(rund + 1);
    }
   
   public void Win(int check, int flg)
    {
        if(check == 0){
            point = PointsPlus();
            JOptionPane.showMessageDialog(null,"User wygral " + point);
            point = PointsMinus();
            if(flg<0)
                JOptionPane.showMessageDialog(null,"Pc ma " + point);
            else
                JOptionPane.showMessageDialog(null,"User2 ma " + point);
        }    
        if(check == -2) {
            point = PointsPlus()+1;
            JOptionPane.showMessageDialog(null,"Pc i user dostali " + point);
        }
        if(check == -1) {
            point = PointsPlus();
            JOptionPane.showMessageDialog(null,"Pc i user dostali " + point);
        }
        
    }

    public void Lose(int flg){

            point = PointsPlus();
            if(flg<0)
            JOptionPane.showMessageDialog(null,"Pc wygral " + point);
            else
                JOptionPane.showMessageDialog(null,"User2 wygral " + point);
            point = PointsMinus();
            JOptionPane.showMessageDialog(null,"User ma " + point);
    }
    
    public int getCh0(){
        return ch0;
    }
    public int getCh1(){
        return ch1;
    }
    public void setCh0(int ch0){
        this.ch0 = ch0;
    }
    public void setCh1(int ch1){
        this.ch1 = ch1;
    }
    
    public boolean getTurn(){
        return turn;
    }
    
    public boolean getWin(){
        return win;
    }
    
    public void setTurn(boolean turn){
        this.turn = turn;
    }
    
    public void setWin(boolean win){
        this.win = win;
    }
    public int getCheck(){
        return check;
    }
    
    public void setCheck(int check){
        this.check = check;
    }

    public void setType(String Type){
        this.Type = Type;
    }

    public String getType(){
        return Type;
    }
    
}