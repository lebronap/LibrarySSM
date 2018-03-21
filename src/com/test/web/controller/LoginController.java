package com.test.web.controller;

import com.test.biz.BookService;
import com.test.biz.LoginService;
import com.test.biz.ManagerService;
import com.test.biz.MemberService;
import com.test.domain.po.Book;
import com.test.domain.po.Login;
import com.test.domain.po.Manager;
import com.test.domain.po.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class LoginController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private MemberService memberService;
    @Autowired
    private ManagerService managerService;
    @Autowired
    private BookService bookService;
    private Login login2;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Login login,HttpSession httpSession) {
        boolean result = loginService.isValidate(login.getNumber(), login.getPassword());

        System.out.println(login.getNumber());

        Login login1 = loginService.findByNumber(login.getNumber());
        login2 = login1;
        System.out.println(login1.toString());
        String identity = login1.getIdentity();
        String viewName = "redirect:/user/login";
        if (result && identity.equals("member")) {
            viewName = "redirect:/user/member";
            httpSession.setAttribute("number", login.getNumber());
            httpSession.setAttribute("identity",login1.getIdentity());
        } else if (result && identity.equals("manager")) {
            viewName = "redirect:/user/manager";
            httpSession.setAttribute("number", login.getNumber());
            httpSession.setAttribute("identity",login1.getIdentity());
        }

        return viewName;
    }

    @RequestMapping(value = "/member", method = RequestMethod.GET)
    public ModelAndView member(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        String viewName = "login";
        if (httpSession.getAttribute("number")!=null){
            Integer number1 = (Integer) httpSession.getAttribute("number");
            Member member = memberService.findByNumber(number1);
            modelAndView.addObject(member);
            viewName = "member";
        }else {
            return modelAndView;
        }
        List<Book> books = bookService.findAll();
        modelAndView.setViewName(viewName);
        Map<String,Object> model = new HashMap<>();
        model.put("books",books);
        modelAndView.addAllObjects(model);
        return modelAndView;
    }

    @RequestMapping(value = "/manager", method = RequestMethod.GET)
    public ModelAndView manager(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        String viewName = "login";
        if (httpSession.getAttribute("number")!=null){
            Integer number1 = (Integer) httpSession.getAttribute("number");
            Manager manager = managerService.findByNumber(number1);
            modelAndView.addObject(manager);
            viewName = "manager";
        }else {
            return modelAndView;
        }
        List<Book> books = bookService.findAll();
        modelAndView.setViewName(viewName);
        Map<String,Object> model = new HashMap<>();
        model.put("books",books);
        modelAndView.addAllObjects(model);
        return modelAndView;
    }

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public MemberService getMemberService() {
        return memberService;
    }

    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
}
