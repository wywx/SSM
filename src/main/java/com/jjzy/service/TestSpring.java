package com.jjzy.service;

import com.jjzy.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author wj
 * @Date 2019/10/27 14:40
 * Version 1.0
 */
public class TestSpring {
    @Test
    public void demo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        List<User> lists = userService.selectAll();
        System.out.println(lists);
    }
}
