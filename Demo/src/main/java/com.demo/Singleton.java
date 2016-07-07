package com.demo;
import java.io.IOException;
public class Singleton {
    String Message = "Hello World!";
    private static Singleton Instance = new Singleton();
    public static Singleton getInstance() {
        return Instance;
    }
    private Singleton() {    }

    public String showMessage(){
        return Message + "\n";
    }
}
