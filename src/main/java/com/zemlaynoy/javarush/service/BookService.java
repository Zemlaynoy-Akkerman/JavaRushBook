/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zemlaynoy.javarush.service;

import com.zemlaynoy.javarush.entity.Book;
import com.zemlaynoy.javarush.webgui.dto.SaerchFilterDto;
import java.util.List;


/**
 *
 * @author alex
 */
public interface BookService {
    
    Book findById(int id);

    void save(BookDto book);

    void update(BookDto book);

    void delete(int id);

    List<Book> findAll();
    
    void ReadAlreadyChange(int id);
    
    List<Book> getBookLimit(int p);
    
    List<Integer> getNumberOfPage();
    
    List<Book> getBooksByFilter(SaerchFilterDto dto);
}
