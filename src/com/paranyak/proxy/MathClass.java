package com.paranyak.proxy;

/**
 * Created by cs.ucu.edu.ua on 12/21/2016.
 */
public class MathClass implements IMath {
    @Override
    public int adding(int x, int y) {
        int sum = x+y;
        return sum;
    }

    @Override
    public double dividing(int a, int b) {
        double div = a/b;
        System.out.println("Dividing in MathClass");
        return div;
    }
}
