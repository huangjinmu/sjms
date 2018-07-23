package com.jim.sjms.factory;

/**
 * Created by jim on 2018-07-22.
 */
public class SimpleFactory implements CarFactory{


    @Override
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
