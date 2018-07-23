package com.jim.sjms.proxy.jdk;

import org.apache.log4j.Logger;

/**
 * Created by jim on 2018-07-22.
 */
public class Jim  implements Person{
    private static Logger logger = Logger.getLogger(Person.class);
    @Override
    public void findLove() {
        System.out.println("我要白富美！");
        System.out.println("肤白貌美大长腿");
    }
}
