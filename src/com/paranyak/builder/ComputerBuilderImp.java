package com.paranyak.builder;

/**
 * Created by cs.ucu.edu.ua on 12/22/2016.
 */
public class ComputerBuilderImp implements IComputer {
    private ComputerBuilder cmp;

    public ComputerBuilderImp() {
        cmp = new ComputerBuilder();
    }

    @Override
    public void setPower(final int power) {
        cmp.setPower(power);
    }

    @Override
    public void setColor(final String color) {
        cmp.setColor(color);
    }

    @Override
    public ComputerBuilder getResult() {
        return cmp;
    }
}
