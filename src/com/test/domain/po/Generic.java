package com.test.domain.po;

import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generic {

    private String identity;
    private ModelAndView modelAndView;
    private List<Book> books;
    private Map<String, Object> map = new HashMap<>();
    private String viewName;

    /*public ModelAndView addBookInfo(List<Book> books, Map<String, Object> map,String viewName){
        map.put("books", books);
        modelAndView.addAllObjects(map);
        modelAndView.setViewName(viewName);

    }*/


    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public ModelAndView getModelAndView() {
        return modelAndView;
    }

    public void setModelAndView(ModelAndView modelAndView) {
        this.modelAndView = modelAndView;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
}
