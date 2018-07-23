package com.jim.sjms.factory.abstr;

import com.jim.sjms.factory.Car;

/**
 * Created by jim on 2018-07-22.
 */
public class TestFactory {
    public static void main(String[] args) {
        AbtractFactory factory=new DefaultFactory();
        Car car = factory.generateCar("Bwm");
        System.out.println(car.getName());

    }
}
