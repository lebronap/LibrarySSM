package com.test.biz;

import com.test.domain.po.User;

import java.util.List;

public interface UserService {
    boolean isValidate(String usn, String pwd);
    List<User> findAll();
}
