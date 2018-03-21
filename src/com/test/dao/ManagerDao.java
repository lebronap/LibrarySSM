package com.test.dao;

import com.test.domain.po.Manager;
import org.springframework.stereotype.Repository;

@Repository("managerDao")
public interface ManagerDao extends GenericDao<Manager,Integer>{
     Manager findByNumber(Integer number);
}
