package com.zhu;

import com.zhu.dynamic.JdkProxy;
import com.zhu.statics.target.RentHouse;
import com.zhu.statics.target.You;

public class Starter {
    public static void main(String[] args) {
        // 目标对象
        RentHouse target = new You();
        JdkProxy jdkProxy = new JdkProxy(target);
        RentHouse object = (RentHouse) jdkProxy.getProxy();
        object.toRendHouse();


    }
}
