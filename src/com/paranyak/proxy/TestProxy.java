package com.paranyak.proxy;

/**
 * Created by cs.ucu.edu.ua on 12/21/2016.
 */
public class TestProxy {
    public static void main(String[] args) {
        System.out.println("Class Proxy");
        System.out.println();
        MathClass mthProxy = new ProxyMath();
        System.out.println("Divide 4 into 0... ");
        System.out.println(mthProxy.dividing(4,0));
        System.out.println("Adding 4 to 5... ");
        System.out.println(mthProxy.adding(4,5));
        MathClass mthProxyTwo = new ProxyMath();
        System.out.println();
        System.out.println("Dividing 4 into 2");
        System.out.println(mthProxyTwo.dividing(4,2));
        System.out.println("Adding 7 to 6...");
        System.out.println(mthProxyTwo.adding(7,6));
    }
}
