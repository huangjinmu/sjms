package com.jim.sjms.factory.func;

import com.jim.sjms.factory.Bwm;
import com.jim.sjms.factory.Car;

/**
 * Created by jim on 2018-07-22.
 */
public class BwmFactory implements Factory {

    @Override
    public Car gererateCar() {
        return new Bwm();
    }
}
