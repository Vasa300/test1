package com.test;

public abstract class Figure {
    public static int count = 1;
    public String type;
    public int id;
    public Figure(){
        id = count++;
    }
    public void display(){

        System.out.println("figure");
    }
}
