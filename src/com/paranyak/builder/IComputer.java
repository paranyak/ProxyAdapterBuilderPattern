package com.paranyak.builder;

/**
 * Created by cs.ucu.edu.ua on 12/22/2016.
 */
interface IComputer {
    void setPower(final int power);

    void setColor(final String color);

    /**
     *
     * @return String which gives information about power and color of computer
     */
    ComputerBuilder getResult();
}
