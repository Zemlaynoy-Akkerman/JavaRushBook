/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zemlaynoy.javarush.webgui.dto;

import com.zemlaynoy.javarush.service.BookDto;

/**
 *
 * @author alex
 */
public class ConverterGuiToService {
    
    public static BookDto bookGuiDtoToBookDto(BookGuiDto bookGuiDto){
        
        BookDto bookDto = new BookDto();
        
        bookDto.setId(bookGuiDto.getId());
        bookDto.setTitle(bookGuiDto.getTitle());
        bookDto.setDescription(bookGuiDto.getDescription());
        bookDto.setAuthor(bookGuiDto.getAuthor());
        bookDto.setIsbn(bookGuiDto.getIsbn());
        bookDto.setPrintYear(bookGuiDto.getPrintYear());
        bookDto.setReadAlready(bookGuiDto.isReadAlready());

        return bookDto;
    }
    
}
