/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zemlaynoy.javarush.service;

import com.zemlaynoy.javarush.entity.Book;

/**
 *
 * @author alex
 */
public class BookConverter {
    
    
    public static Book bookDtoToBookEntity(BookDto bookDto){
        
        Book book = new Book();
        
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setDescription(bookDto.getDescription());
        book.setAuthor(bookDto.getAuthor());
        book.setIsbn(bookDto.getIsbn());
        book.setPrintYear(bookDto.getPrintYear());
        book.setReadAlready(bookDto.isReadAlready());
        
        return book;
    }
    
     public static BookDto bookEntityToBookDto(Book book){
         
        BookDto bookDto = new BookDto();
         
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        bookDto.setDescription(book.getDescription());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setIsbn(book.getIsbn());
        bookDto.setPrintYear(book.getPrintYear());
        bookDto.setReadAlready(book.isReadAlready());
        
        return bookDto;
     }
    
}
