package com.test.biz.impl;

import com.test.biz.ManagerService;
import com.test.dao.ManagerDao;
import com.test.domain.po.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    private ManagerDao managerDao;

    @Override
    public Manager findByNumber(Integer number) {
        return managerDao.findByNumber(number);
    }
}
