package com.jim.sjms.proxy.custom;

import java.lang.reflect.Method;

/**
 * Created by jim on 2018-07-22.
 */
public interface FsInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
