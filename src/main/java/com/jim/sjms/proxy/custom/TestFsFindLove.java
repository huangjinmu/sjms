package com.jim.sjms.proxy.custom;

import com.jim.sjms.proxy.jdk.Jim;
import com.jim.sjms.proxy.jdk.Meipo;
import com.jim.sjms.proxy.jdk.Person;

/**
 * Created by jim on 2018-07-22.
 */
public class TestFsFindLove {
    public static void main(String[] args)throws Exception {
        Jim jim = new Jim();
        FsMeipo meipo = new FsMeipo(jim);
        Person obj=(Person) FsProxy.newProxyInstance(new FsClassLoader(),jim.getClass().getInterfaces(),meipo);
        obj.findLove();
    }
}
