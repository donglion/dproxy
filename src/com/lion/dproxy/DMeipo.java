package com.lion.dproxy;

import java.lang.reflect.Method;

/**
 * Created by lion on 2019/8/17.
 */
public class DMeipo implements DInvocationHandler {

    // 被代理的对象，把引用保存下来
    private Object target;

    public Object getInstance(Object target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();
        return DProxy.newProxyInstance(new DClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target, args);
        after();
        return null;
    }

    private void before() {
        System.out.println("我是媒婆：我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("如果合适的话，就准备办事");
    }

}
