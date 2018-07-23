package com.jim.sjms.factory.func;

import com.jim.sjms.factory.Car;

/**
 * Created by jim on 2018-07-22.
 */
public class TestFactory {

    public static void main(String[] args) {
       // Factory f=new BenzFactory();
        Factory f=new BwmFactory();
        Car car = f.gererateCar();
        System.out.println(car.getName());

    }
}
