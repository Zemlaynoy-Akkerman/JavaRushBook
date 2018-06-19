/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zemlaynoy.javarush.webgui.controller;

import com.zemlaynoy.javarush.entity.Book;
import com.zemlaynoy.javarush.service.BookServiceImpl;
import com.zemlaynoy.javarush.webgui.dto.BookGuiDto;
import com.zemlaynoy.javarush.webgui.dto.ConverterGuiToService;
import com.zemlaynoy.javarush.webgui.dto.SaerchFilterDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author alex
 */
@Controller
public class ControllerGUI {
    
    BookServiceImpl service = new BookServiceImpl();
    
    @RequestMapping(value = {"/","/home"})
    public ModelAndView getHome(@RequestParam(value ="page", required = false) String page){
        int indexPage = 1;
        if(page != null && !page.isEmpty()){
            indexPage = Integer.valueOf(page);
        }
        ModelAndView model = new ModelAndView("home");
        model.addObject("books", service.getBookLimit(indexPage));
        model.addObject("numberPage", service.getNumberOfPage());        
        return model;
    }
    
    
    @RequestMapping(value = "/delete_book")
    public Object deleteBoo(@RequestParam (value = "idBook") int id){
        if(id >= 0){
            service.delete(id);
        }
        return "redirect:home";
    }
    
    @RequestMapping(value = "/change_readAlready_book")
    public Object changeReadAlready(@RequestParam (value = "id") int id){
        service.ReadAlreadyChange(id);
        
        return "redirect:home";
    }
    
    @RequestMapping(value = "/send_book")
        public Object sentBook(BookGuiDto book){
        service.save(ConverterGuiToService.bookGuiDtoToBookDto(book));
        return "redirect:home";
    }
    
    @RequestMapping(value= "/book_edit_record")
    public Object editBook(
            @RequestParam(value = "id") int id){
        ModelAndView model = new ModelAndView("book_edit_record");
        if(id >= 0){
            Book book = service.findById(id);
            model.addObject("book", book);
        }
        return model;
    }
    
    @RequestMapping(value= "/form_book")
    public Object formBook(){
        ModelAndView model = new ModelAndView("form_book");
        return model;
    }
    
    @RequestMapping(value = "/update_book")
        public Object updateBook(BookGuiDto bookGui){
            service.update(ConverterGuiToService.bookGuiDtoToBookDto(bookGui));
            return "redirect:home";
    }
        
    @RequestMapping(value= "/form_search")
    public Object formSearch(){
        ModelAndView model = new ModelAndView("form_search");
        return model;
    }
    
    @RequestMapping(value = "/search")
    public ModelAndView getSearch(SaerchFilterDto dto){
        ModelAndView model = new ModelAndView("search");
        model.addObject("booksSearch", service.getBooksByFilter(dto));
        return model;
    }
}
