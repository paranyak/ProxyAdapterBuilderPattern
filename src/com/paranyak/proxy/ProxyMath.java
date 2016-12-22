package com.paranyak.proxy;


/**
 * Created by cs.ucu.edu.ua on 12/21/2016.
 */
public class ProxyMath extends MathClass implements IMath {
    private MathClass mth;
    public ProxyMath(){
    }
    @Override
    public int adding(int x, int y) {
        if(mth == null){
            mth = new MathClass();
        }
        System.out.println("Result: ");
        return mth.adding(x,y);
    }

    @Override
    public double dividing(int a, int b) {
        if(mth == null){
            mth = new MathClass();
        }
        System.out.println("Result: ");
        if(b != 0){
            return mth.dividing(a,b);
        }else{
            System.out.println("Oops, you can't divide into zero");
            return 0;
        }
    }
}
