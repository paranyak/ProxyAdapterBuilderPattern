package com.paranyak.adapter;

/**
 * Created by cs.ucu.edu.ua on 12/13/2016.
 */
public class DataAdapter extends Data implements IDataAdapter {

    @Override
    public int retX(int x) {
        return getPrettyX(x);
    }

    @Override
    public int retY(int y) {
        return getNiceY(y);
    }
}
