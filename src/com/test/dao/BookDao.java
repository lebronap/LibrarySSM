package com.test.dao;

import com.test.domain.po.Book;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository("bookDao")
public interface BookDao extends GenericDao<Book, Integer> {
    List<Book> findByBookTitle(String bookTitle);

    List<Book> findByBookNum(Integer bookNum);

    List<Book> findByAuthor(String author);

    List<Book> findByTypeX(String typeX);

    List<Book> findByPress(String press);

    Book findByBookNum1(Integer bookNum);

    void addBookInfo(Book book);

    void updateBookByNumber(Integer bookNum, Book book);

    void deleteBookByNumber(Integer bookNum);

    void deleteBookById(Integer id);

    /*void updateBookById(String bookTitle, Integer bookNum, String author, String press, String describeX, String address, String typeX, Integer id);
*/
    void updateBookById(Book book);

}
