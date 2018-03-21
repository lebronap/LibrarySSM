package com.test.web.controller;

import com.test.biz.LoginService;
import com.test.biz.MemberService;
import com.test.domain.po.Book;
import com.test.domain.po.Login;
import com.test.domain.po.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/user")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private LoginService loginService;


    @RequestMapping(value = "/addMember", method = RequestMethod.GET)
    public String toAddBookInfo() {
        return "addMember";
    }

    @RequestMapping(value = "/addMember", method = RequestMethod.POST)
    public ModelAndView showBookInfo(Member member) {
        ModelAndView modelAndView = new ModelAndView();
        memberService.addMember(member);
        Login login = new Login();
        login.setNumber(member.getNumber());
        loginService.addLogin(login);
        modelAndView.setViewName("redirect:/user/addMember");
        return modelAndView;
    }
}
