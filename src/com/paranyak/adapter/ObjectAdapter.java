package com.paranyak.adapter;

/**
 * Created by cs.ucu.edu.ua on 12/22/2016.
 */
public class ObjectAdapter implements IDataAdapter {
    private Data dt;
    public ObjectAdapter(){
            dt = new Data();
        }

    @Override
    public int retX(int x) {
        return dt.getPrettyX(x);
    }

    @Override
    public int retY(int y) {
        return dt.getNiceY(y);
    }
}
