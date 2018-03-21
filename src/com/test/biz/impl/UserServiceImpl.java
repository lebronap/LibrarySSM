package com.test.biz.impl;

import com.test.biz.UserService;
import com.test.dao.UserDao;
import com.test.domain.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Override
    public boolean isValidate(String usn, String pwd) {
        User user = userDao.findByUsn(usn);
        boolean result = false;
        if (user!=null && user.getPwd() != null && pwd.equals(user.getPwd()))
            result = true;
        return result;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
