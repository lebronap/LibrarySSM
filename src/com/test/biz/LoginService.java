package com.test.biz;

import com.test.domain.po.Login;

import java.util.List;

public interface LoginService {
    boolean isValidate(Integer number, String password);
    Login findByNumber(Integer number);

    void addLogin(Login login);
}
