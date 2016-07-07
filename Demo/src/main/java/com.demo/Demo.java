package com.demo;
public class Demo {
    public static void main(String[] args){
        Singleton object = Singleton.getInstance();
        //show the message
        object.showMessage();
        Model theModel = new Model();
        View tV = new View();
            tV.mView();
        Controller theController = new Controller(theModel, tV);
       theController.ctrl();
    }
}
