package com.test.biz;

import com.test.domain.po.Member;

public interface MemberService {
    Member findByNumber(Integer number);

    void addMember(Member member);
}
