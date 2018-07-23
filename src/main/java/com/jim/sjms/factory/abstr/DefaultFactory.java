package com.jim.sjms.factory.abstr;

import com.jim.sjms.factory.Car;

/**
 * Created by jim on 2018-07-22.
 */
public class DefaultFactory extends AbtractFactory {
   private AbtractFactory defaultFactory=new BenzFactory();
    @Override
    public Car generateCar() {
        return defaultFactory.generateCar();
    }
}
