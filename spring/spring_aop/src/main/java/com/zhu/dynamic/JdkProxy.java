package com.zhu.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy {
    // 目标对象
    private Object target;

    public JdkProxy(Object target){
        this.target = target;
    }
    public Object getProxy(){

        ClassLoader loader = this.getClass().getClassLoader();

        // 要代理的对象提供一组什么借口
        Class[] interfaces = target.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //System.out.println("test...");
                /**
                 *
                 * */
                System.out.println("方法调用前。。");
                method.invoke(target,args);
                System.out.println("方法调用后。。");
                return null;
            }
        };
        Object object = Proxy.newProxyInstance(loader,interfaces,invocationHandler);
        return object;
    }
}
