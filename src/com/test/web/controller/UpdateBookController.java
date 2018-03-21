package com.test.web.controller;


import com.test.biz.BookService;
import com.test.domain.po.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UpdateBookController {
    @Autowired
    private BookService bookService;


    @RequestMapping(value = "/selectBookInfoByBookNum1", method = RequestMethod.GET)
    public String toSelectBookInfo(){
        String viewName = "updateBookInfo";
        return viewName;
    }

    @RequestMapping(value = "/selectBookInfoByBookNum1", method = RequestMethod.POST)
    public ModelAndView toSelectBookInfo(Integer bookNum){
        ModelAndView modelAndView = new ModelAndView();
        Book book =  bookService.findByBookNum1(bookNum);
        modelAndView.addObject(book);
        modelAndView.setViewName("updateBookInfo");
        return modelAndView;
    }


    @RequestMapping(value = "/updateBookInfo", method = RequestMethod.GET)
    public String selectBookInfo() {
        return "updateBookInfo";
    }

    @RequestMapping(value = "/updateBookInfo", method = RequestMethod.POST)
    public ModelAndView updateBookInfo() {
        ModelAndView modelAndView = new ModelAndView();
        String viewName = "redirect:/user/updateBookInfo";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }



    @RequestMapping(value = "/updateBookInfo1", method = RequestMethod.GET)
    public String toUpdateBookInfo(){
        String viewName = "updateBookInfo";
        return viewName;
    }

    @RequestMapping(value = "/updateBookInfo1", method = RequestMethod.POST)
    public ModelAndView updateBookInfo(Book book){
        System.out.println(book.toString());
        ModelAndView modelAndView = new ModelAndView();
        Book book1 = bookService.findByBookNum1(book.getBookNum());
        /*bookService.updateBookById(book.getBookTitle(),book.getBookNum(),book.getAuthor(),book.getPress(),book.getDescribe(),book.getAddress(),book.getType(),book1.getId());
        */
        book.setId(book1.getId());
        System.out.println(book.toString());
        bookService.updateBookById(book);
        modelAndView.setViewName("updateBookInfo");
        return modelAndView;
    }


}
