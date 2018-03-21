package com.test.dao;

import com.test.domain.po.Login;
import org.springframework.stereotype.Repository;

@Repository("LoginDao")
public interface LoginDao extends GenericDao<Login, Integer>{
    Login findByNumber(Integer number);

    void addLogin(Login login);
}
