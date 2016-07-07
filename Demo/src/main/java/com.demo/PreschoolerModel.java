package com.demo;
public class PreschoolerModel extends PlayerModel{
    private String name, surname;

    public PreschoolerModel (String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        limit = 40;
    }

}