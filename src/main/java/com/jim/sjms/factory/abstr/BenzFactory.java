package com.jim.sjms.factory.abstr;

import com.jim.sjms.factory.Benz;
import com.jim.sjms.factory.Car;
import com.jim.sjms.factory.func.Factory;

/**
 * Created by jim on 2018-07-22.
 */
public class BenzFactory extends AbtractFactory {



    @Override
    public Car generateCar() {
        return new Benz();
    }
}
