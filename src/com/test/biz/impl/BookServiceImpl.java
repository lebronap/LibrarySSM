package com.test.biz.impl;

import com.test.biz.BookService;
import com.test.dao.BookDao;
import com.test.domain.po.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;


    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public List<Book> findByBookTitle(String bookTitle) {
        return bookDao.findByBookTitle(bookTitle);
    }

    @Override
    public List<Book> findByBookNum(Integer bookNum) {
        return bookDao.findByBookNum(bookNum);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return bookDao.findByAuthor(author);
    }

    @Override
    public List<Book> findByTypeX(String typeX) {
        return bookDao.findByTypeX(typeX);
    }

    @Override
    public List<Book> findByPress(String press) {
        return bookDao.findByPress(press);
    }

    @Override
    public Book findByBookNum1(Integer bookNum) {
        return bookDao.findByBookNum1(bookNum);
    }

    @Override
    public void addBookInfo(Book book) {
        bookDao.addBookInfo(book);
    }

    @Override
    public void updateBookByNumber(Integer bookNum, Book book) {
        bookDao.updateBookByNumber(bookNum,book);
    }

   /* @Override
    public void updateBookById(String bookTitle, Integer bookNum, String author, String press, String describe, String address, String type, Integer id) {
        bookDao.updateBookById(bookTitle, bookNum, author, press, describe, address, type, id);
    }*/

    @Override
    public void updateBookById(Book book) {
        bookDao.updateBookById(book);
        System.out.println(book.toString());
    }

    @Override
    public void deleteBookByNumber(Integer bookNum) {
        bookDao.deleteBookByNumber(bookNum);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookDao.deleteBookById(id);
    }


}
