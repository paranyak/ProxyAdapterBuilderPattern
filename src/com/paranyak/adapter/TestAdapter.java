package com.paranyak.adapter;

/**
 * Created by cs.ucu.edu.ua on 12/21/2016.
 */
public class TestAdapter {
    public static void main(String[] args) {
        System.out.println("Class Adapter");
        DataAdapter dtA =new DataAdapter();
        System.out.println("Class Adapter is returning y: "+dtA.getNiceY(1));
        System.out.println("Class Adapter is returning x: "+dtA.getPrettyX(5));
    }
}
