package com.test.domain.po;


import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component("member")
public class Member implements Serializable{

    private Integer id;
    private Integer number;
    private String trueName;
    private Integer borrowNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public Integer getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(Integer borrowNum) {
        this.borrowNum = borrowNum;
    }
}
