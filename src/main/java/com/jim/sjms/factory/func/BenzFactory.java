package com.jim.sjms.factory.func;

import com.jim.sjms.factory.Benz;
import com.jim.sjms.factory.Car;
import com.jim.sjms.factory.CarFactory;

/**
 * Created by jim on 2018-07-22.
 */
public class BenzFactory implements Factory {


    @Override
    public Car gererateCar() {
        return new Benz();
    }
}
