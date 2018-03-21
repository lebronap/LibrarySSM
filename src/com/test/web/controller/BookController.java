package com.test.web.controller;

import com.test.biz.BookService;
import com.test.domain.po.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class BookController {
    @Autowired
    private BookService bookService;

    private String identity;
    private ModelAndView modelAndView;


    /*添加图书*/
    @RequestMapping(value = "/addBookInfo", method = RequestMethod.GET)
    public String toAddBookInfo() {
        return "addBookInfo";
    }

    @RequestMapping(value = "/addBookInfo", method = RequestMethod.POST)
    public ModelAndView addBookInfo(Book book) {
        bookService.addBookInfo(book);
        ModelAndView modelAndView = new ModelAndView();
        String viewName = "redirect:/user/addBookInfo";
        modelAndView.setViewName(viewName);
        modelAndView.addObject("message", "添加成功");
        return modelAndView;
    }


    /*查找图书*/
    @RequestMapping(value = "/selectBookInfo", method = RequestMethod.GET)
    public String selectBookInfo() {
        return "selectBookInfo";
    }

    @RequestMapping(value = "/selectBookInfo", method = RequestMethod.POST)
    public ModelAndView selectBookInfo(Book book) {
        ModelAndView modelAndView = new ModelAndView();
        String viewName = "redirect:/user/selectBookInfo";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }


    /*查找图书*/
    @RequestMapping(value = "/selectBookInfo1", method = RequestMethod.GET)
    public String selectBookInfo1() {
        return "selectBookInfo1";
    }

    @RequestMapping(value = "/selectBookInfo1", method = RequestMethod.POST)
    public ModelAndView selectBookInfo1(Book book) {
        ModelAndView modelAndView = new ModelAndView();
        String viewName = "redirect:/user/selectBookInfo1";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }


    /*selectBookInfoByBookTitle*/
    @RequestMapping(value = "/selectBookInfoByBookTitle", method = RequestMethod.GET)
    public String selectBookInfoByBookTitle(HttpSession httpSession) {
        String viewName = "login";
        identity = (String) httpSession.getAttribute("identity");
        if (identity != null && identity.equals("member")) {
            viewName = "showBooks1";
        } else if (identity != null && identity.equals("manager")) {
            viewName = "showBooks";
        } else {
            return viewName;
        }
        return viewName;
    }

    @RequestMapping(value = "/selectBookInfoByBookTitle", method = RequestMethod.POST)
    public ModelAndView selectBookInfoByBookTitle(String bookTitle, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        identity = (String) httpSession.getAttribute("identity");
        String viewName = "login";
        if (identity != null && identity.equals("member")) {
            viewName = "showBooks1";
        } else if (identity != null && identity.equals("manager")) {
            viewName = "showBooks";
        } else {
            modelAndView.setViewName(viewName);
            return modelAndView;
        }

        List<Book> books = bookService.findByBookTitle(bookTitle);
        Map<String, Object> map = new HashMap<>();
        map.put("books", books);
        modelAndView.addAllObjects(map);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }


    /*selectBookInfoByBookNum*/
    @RequestMapping(value = "/selectBookInfoByBookNum", method = RequestMethod.GET)
    public String selectBookInfoByBookNum(HttpSession httpSession) {
        identity = (String) httpSession.getAttribute("identity");
        String viewName = "login";
        if (identity != null && identity.equals("member")) {
            viewName = "showBooks1";
        } else if (identity != null && identity.equals("manager")) {
            viewName = "showBooks";
        } else {
            return viewName;
        }
        return viewName;
    }

    @RequestMapping(value = "/selectBookInfoByBookNum", method = RequestMethod.POST)
    public ModelAndView selectBookInfoByBookNum(Integer bookNum, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        identity = (String) httpSession.getAttribute("identity");
        String viewName = "login";
        if (identity != null && identity.equals("member")) {
            viewName = "showBooks1";
        } else if (identity != null && identity.equals("manager")) {
            viewName = "showBooks";
        } else {
            modelAndView.setViewName(viewName);
            return modelAndView;
        }

        List<Book> books = bookService.findByBookNum(bookNum);
        Map<String, Object> map = new HashMap<>();
        map.put("books", books);
        modelAndView.addAllObjects(map);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }


    /*selectBookInfoByAuthor*/
    @RequestMapping(value = "/selectBookInfoByAuthor", method = RequestMethod.GET)
    public String selectBookInfoByAuthor(HttpSession httpSession) {
        identity = (String) httpSession.getAttribute("identity");
        String viewName = "login";
        if (identity != null && identity.equals("member")) {
            viewName = "showBooks1";
        } else if (identity != null && identity.equals("manager")) {
            viewName = "showBooks";
        } else {
            return viewName;
        }
        return viewName;
    }

    @RequestMapping(value = "/selectBookInfoByAuthor", method = RequestMethod.POST)
    public ModelAndView selectBookInfoByAuthor(String author, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        identity = (String) httpSession.getAttribute("identity");
        String viewName = "login";
        if (identity != null && identity.equals("member")) {
            viewName = "showBooks1";
        } else if (identity != null && identity.equals("manager")) {
            viewName = "showBooks";
        } else {
            modelAndView.setViewName(viewName);
            return modelAndView;
        }

        List<Book> books = bookService.findByAuthor(author);
        Map<String, Object> map = new HashMap<>();
        map.put("books", books);
        modelAndView.addAllObjects(map);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }


    /*selectBookInfoByPress*/
    @RequestMapping(value = "/selectBookInfoByPress", method = RequestMethod.GET)
    public String selectBookInfoByPress(HttpSession httpSession) {
        identity = (String) httpSession.getAttribute("identity");
        String viewName = "login";
        if (identity != null && identity.equals("member")) {
            viewName = "showBooks1";
        } else if (identity != null && identity.equals("manager")) {
            viewName = "showBooks";
        } else {
            return viewName;
        }
        return viewName;
    }

    @RequestMapping(value = "/selectBookInfoByPress", method = RequestMethod.POST)
    public ModelAndView selectBookInfoByPress(String press, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        identity = (String) httpSession.getAttribute("identity");
        String viewName = "login";
        if (identity != null && identity.equals("member")) {
            viewName = "showBooks1";
        } else if (identity != null && identity.equals("manager")) {
            viewName = "showBooks";
        } else {
            modelAndView.setViewName(viewName);
            return modelAndView;
        }

        List<Book> books = bookService.findByPress(press);
        Map<String, Object> map = new HashMap<>();
        map.put("books", books);
        modelAndView.addAllObjects(map);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }


    /*selectBookInfoByTypeX*/
    @RequestMapping(value = "/selectBookInfoByTypeX", method = RequestMethod.GET)
    public String selectBookInfoByTypeX(HttpSession httpSession) {
        identity = (String) httpSession.getAttribute("identity");
        String viewName = "login";
        if (identity != null && identity.equals("member")) {
            viewName = "showBooks1";
        } else if (identity != null && identity.equals("manager")) {
            viewName = "showBooks";
        } else {
            return viewName;
        }
        return viewName;
    }

    @RequestMapping(value = "/selectBookInfoByTypeX", method = RequestMethod.POST)
    public ModelAndView selectBookInfoByTypeX(String typeX, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        identity = (String) httpSession.getAttribute("identity");
        String viewName = "login";
        if (identity != null && identity.equals("member")) {
            viewName = "showBooks1";
        } else if (identity != null && identity.equals("manager")) {
            viewName = "showBooks";
        } else {
            modelAndView.setViewName(viewName);
            return modelAndView;
        }

        List<Book> books = bookService.findByTypeX(typeX);
        Map<String, Object> map = new HashMap<>();
        map.put("books", books);
        modelAndView.addAllObjects(map);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }


}
