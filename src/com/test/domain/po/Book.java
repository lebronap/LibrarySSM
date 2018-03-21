package com.test.domain.po;

import org.springframework.stereotype.Component;


import java.io.Serializable;
@Component("book")
public class Book implements Serializable {
    private Integer id;
    private String bookTitle;
    private Integer bookNum;
    private String author;
    private String press;
    private String describeX;
    private String address;
    private String typeX;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getDescribeX() {
        return describeX;
    }

    public void setDescribeX(String describeX) {
        this.describeX = describeX;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeX() {
        return typeX;
    }

    public void setTypeX(String typeX) {
        this.typeX = typeX;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookNum=" + bookNum +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", describeX='" + describeX + '\'' +
                ", address='" + address + '\'' +
                ", typeX='" + typeX + '\'' +
                '}';
    }
}
