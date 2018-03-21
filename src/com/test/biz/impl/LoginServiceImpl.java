package com.test.biz.impl;

import com.test.biz.LoginService;
import com.test.dao.LoginDao;
import com.test.domain.po.Login;
import com.test.domain.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("loginService")
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao loginDao;

    @Override
    public boolean isValidate(Integer number, String password) {
        Login login = loginDao.findByNumber(number);
        boolean result = false;
        if (login!=null && login.getPassword() != null && password.equals(login.getPassword()))
            result = true;
        return result;
    }

    @Override
    public Login findByNumber(Integer number) {
        Login login = loginDao.findByNumber(number);
        return login;
    }

    @Override
    public void addLogin(Login login) {
        loginDao.addLogin(login);
    }


}
