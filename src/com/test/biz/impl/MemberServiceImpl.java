package com.test.biz.impl;

import com.test.biz.MemberService;
import com.test.dao.MemberDao;
import com.test.domain.po.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberDao memberDao;
    @Override
    public Member findByNumber(Integer number) {
        return memberDao.findByNumber(number);
    }

    @Override
    public void addMember(Member member) {
        memberDao.addMember(member);
    }
}
