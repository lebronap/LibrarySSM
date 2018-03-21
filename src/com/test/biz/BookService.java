package com.test.biz;

import com.test.domain.po.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    List<Book> findByBookTitle(String bookTitle);
    List<Book> findByBookNum(Integer bookNum);
    List<Book> findByAuthor(String author);
    List<Book> findByTypeX(String typeX);
    List<Book> findByPress(String press);

    Book findByBookNum1(Integer bookNum);

    void addBookInfo(Book book);
    void updateBookByNumber(Integer bookNum, Book book);
    /*void updateBookById(String bookTitle, Integer bookNum, String author, String press, String describe, String address, String type, Integer id);
    */
    void updateBookById(Book book);
    void deleteBookByNumber(Integer bookNum);
    void deleteBookById(Integer id);

}
