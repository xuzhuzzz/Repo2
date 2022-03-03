package com.zhu.factory;

public interface MyFactory {
    /**
     * 通过id获取bean
     * @param id
     * @return
     */
    Object getBean(String id);
}
