package com.jim.sjms.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * Created by jim on 2018-07-22.
 */
public class TestFindLove {
    public static void main(String[] args) throws Exception{
        Jim jim = new Jim();
        Meipo meipo = new Meipo(jim);
        Person obj = (Person) Proxy.newProxyInstance(jim.getClass().getClassLoader(), jim.getClass().getInterfaces(), meipo);

        System.out.println(obj.getClass());
        byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", obj.getClass().getInterfaces());
         FileOutputStream out=new FileOutputStream("E:/$Proxy0.class");
        out.write($Proxy0s);
        out.close();
        obj.findLove();

    }
}
