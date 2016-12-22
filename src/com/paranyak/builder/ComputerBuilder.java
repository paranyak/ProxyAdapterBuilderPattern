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

    /**
     *
     * @return power of computer
     */
    public int getPower() {
        return power;
    }

    /**
     *
     * @param power number
     */

    public void setPower(final int power) {
        this.power = power;
    }

    /**
     *
     * @return color of computer
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color String
     */
    public void setColor(final String color) {
        this.color = color;
    }
}

