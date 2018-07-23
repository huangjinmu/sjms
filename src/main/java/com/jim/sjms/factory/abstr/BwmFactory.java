package com.jim.sjms.factory.abstr;

import com.jim.sjms.factory.Bwm;
import com.jim.sjms.factory.Car;
import com.jim.sjms.factory.func.Factory;

/**
 * Created by jim on 2018-07-22.
 */
public class BwmFactory extends AbtractFactory {



    @Override
    public Car generateCar() {
        return new Bwm();
    }
}
