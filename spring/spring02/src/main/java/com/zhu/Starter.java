package com.zhu;

import com.zhu.dao.UserDao;
import com.zhu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args ) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
       // System.out.println( "Hello World!" );
        UserDao dao = (UserDao) ac.getBean("userDao");
        UserService service = (UserService) ac.getBean("userService");

        dao.test();
        service.test();
    }
}
