package com.test.biz;

import com.test.domain.po.Manager;
import com.test.domain.po.Member;

public interface ManagerService {
    Manager findByNumber(Integer number);

}
