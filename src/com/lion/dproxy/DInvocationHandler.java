package com.lion.dproxy;

import java.lang.reflect.Method;

/**
 * Created by lion on 2019/8/17.
 */
public interface DInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
