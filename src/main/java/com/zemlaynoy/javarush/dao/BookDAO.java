package com.zemlaynoy.javarush.dao;

import com.zemlaynoy.javarush.entity.Book;
import java.util.List;

public interface BookDAO {

    Book findById(int id);

    void save(Book book);

    void update(Book book);

    void delete(Book book);

    List<Book> findAll();

    List<Book> searchBooks(int year);

    List<Book> getBookLimit(int first, int last);
    
    long getCountBook ();

    public List<Book> getBookByTitle(String title);
}
