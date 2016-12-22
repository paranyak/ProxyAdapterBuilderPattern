package com.paranyak.builder;

/**
 * Created by cs.ucu.edu.ua on 12/21/2016.
 */
public class ComputerBuilder{

    private int power;
    private String color;

    public ComputerBuilder() {
    }

    @Override
    public String toString() {
        return "Computer: power = " + power + ", color = " + color + ")";
    }

    public int getPower() {
        return power;
    }


    public void setPower(final int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }
}

