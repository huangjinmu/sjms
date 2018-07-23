package com.jim.sjms.factory.abstr;

import com.jim.sjms.factory.Benz;
import com.jim.sjms.factory.Bwm;
import com.jim.sjms.factory.Car;

/**
 * Created by jim on 2018-07-22.
 */
public abstract class AbtractFactory {

    public abstract Car generateCar();

    public Car generateCar(String name) {
        Car car=null;
        if ("Benz".equalsIgnoreCase(name)){
            car =new Benz();
        }else if ("Bwm".equalsIgnoreCase(name)){
            car=new Bwm();
        }
        return car;
    }
}
