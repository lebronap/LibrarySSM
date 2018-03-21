package com.test.dao;

import com.test.domain.po.Member;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("memberDao")
public interface MemberDao extends GenericDao<Member, Integer>{
      Member findByNumber(Integer number);
      List<Member> findByTrueName(String trueName);

      void addMember(Member member);
}
