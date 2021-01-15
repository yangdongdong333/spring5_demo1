package com.ydd.spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ydd.spring5.service.UserService;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/15 9:48
 * @Description:
 */
public class TestBook
{
    @Test
    public void testAccount()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
