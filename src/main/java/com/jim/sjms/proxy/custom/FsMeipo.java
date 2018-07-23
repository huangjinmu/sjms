package com.jim.sjms.proxy.custom;

import com.jim.sjms.proxy.jdk.Person;

import java.lang.reflect.Method;

/**
 * Created by jim on 2018-07-22.
 */
public class FsMeipo implements FsInvocationHandler {

    private Person target;

    public FsMeipo(Person target){
        this.target=target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       this.preHandle();
        method.invoke(target,null);
        this.afterHandle();
        return null;
    }

    void preHandle(){
        System.out.println("媒婆：开始找姑娘！");
    }
    void afterHandle(){
        System.out.println("媒婆：结束找姑娘！");
    }
}
