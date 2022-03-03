package com.zhu.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyClassPathXmlApplicationContext implements MyFactory{

    private List<MyBean> beanList = new ArrayList<>();
    private Map<String,Object> beanMap = new HashMap<>();

    public MyClassPathXmlApplicationContext(String fileName){
        // 解析xml文件
        parseXml(fileName);

        //初始化beans
        instanceBean();
    }

    public void parseXml(String fileName){

    }

    /**
     * 根据配置文件初始化bean
     */
    public void  instanceBean(){

    }

    @Override
    public Object getBean(String id) {
        return beanMap.get(id);
    }
}
