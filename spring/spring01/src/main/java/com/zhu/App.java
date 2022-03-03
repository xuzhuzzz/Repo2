package com.zhu;

import com.zhu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // 得到spring上下文环境
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

        // 得到需要实例化的对象
        UserService userService = (UserService) ac.getBean("userService");
        userService.test();
    }

}
