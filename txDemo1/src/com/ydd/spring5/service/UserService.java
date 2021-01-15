package com.ydd.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydd.spring5.dao.UserDao;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/15 9:22
 * @Description:
 */
@Service()
public class UserService
{
    //注入Dao
    @Autowired
    private UserDao userDao;

    public void accountMoney()
    {
        //lucy少一百
        userDao.reduceMoney();
        //mary多一百
        userDao.addMoney();
    }
}
