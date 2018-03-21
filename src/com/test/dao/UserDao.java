package com.test.dao;

import com.test.domain.po.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserDao extends GenericDao<User, Integer>{
    User findByUsn(String usn);
}
