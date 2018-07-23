package com.jim.sjms.factory;

/**
 * Created by jim on 2018-07-22.
 */
public class TestFactory {
    public static void main(String[] args) {
        CarFactory sf= new SimpleFactory();
        Car benz = sf.generateCar("Bwm");
        String name = benz.getName();
        System.out.println(name);

    }
}
