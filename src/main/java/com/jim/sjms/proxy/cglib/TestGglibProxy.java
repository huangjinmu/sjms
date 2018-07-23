package com.jim.sjms.proxy.cglib;

/**
 * Created by jim on 2018-07-22.
 */
public class TestGglibProxy {
    //JDK的动态代理是通过接口来进行强制转换的
    //生成以后的代理对象，可以强制转换为接口


    //CGLib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
    //生成以后的对象，可以强制转换为被代理对象（也就是用自己写的类）
    //子类引用赋值给父类

    public static void main(String[] args) {
        try {
            Jim obj = (Jim)new Meipo().getInstance(Jim.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
