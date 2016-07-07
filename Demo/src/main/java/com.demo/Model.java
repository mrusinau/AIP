package com.demo;
public class Model {
    private int point = 1;
    private int rund = 2;
    private int game=0, gamer;

    private String name, surname;

    PlayerModel Gamer;
    
    public void setPoint(int point){
        this.point = point;
    }
    public void setRund(int rund){
        this.rund = rund;
    }
    public int getPoint(){
        return point;
    }
    public int getRund(){
        return rund;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public int getGame(){
        return game;
    }

    public void setGame(int game){
        this.game=game;
    }

    public int getGamer(){
        return gamer;
    }

    public void setGamer(int gamer){
        this.gamer=gamer;
    }
    

}
