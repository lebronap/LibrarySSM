package com.test.web.controller;

import com.test.biz.BookService;
import com.test.domain.po.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user")
public class DeleteBookController {
    @Autowired
    private BookService bookService;


    @RequestMapping(value = "/deleteBookInfo", method = RequestMethod.GET)
    public String toDeleteBookInfo(){
        String viewName = "deleteBookInfo";
        return viewName;
    }

    @RequestMapping(value = "/deleteBookInfo", method = RequestMethod.POST)
    public ModelAndView deleteBookInfo(Integer bookNum){
        ModelAndView modelAndView = new ModelAndView();
        bookService.deleteBookByNumber(bookNum);
        modelAndView.setViewName("deleteBookInfo");
        return modelAndView;
    }

}
