package com.zemlaynoy.javarush.service;

import com.zemlaynoy.javarush.dao.BookDAO;
import com.zemlaynoy.javarush.dao.BookDAOImpl;
import com.zemlaynoy.javarush.entity.Book;
import com.zemlaynoy.javarush.webgui.dto.SaerchFilterDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {
    private BookDAO dao = new BookDAOImpl();

    @Override
    public Book findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void save(BookDto book) {
        dao.save(BookConverter.bookDtoToBookEntity(book));
    }

    @Override
    public void update(BookDto book) {
        dao.update(BookConverter.bookDtoToBookEntity(book));
    }

    @Override
    public void delete(int id) {
        Book book = dao.findById(id);
        dao.delete(book);
    }

    @Override
    public List<Book> findAll() {
        return dao.findAll();
    }

    @Override
    public void ReadAlreadyChange(int id) {
        Book book = dao.findById(id);
        book.setReadAlready(true);
        dao.update(book);
    }

    @Override
    public List<Book> getBookLimit(int p) {
        int limit = 10;
        int index = limit * p - limit ;
        return  dao.getBookLimit(index, limit);
    }

    @Override
    public List<Integer> getNumberOfPage() {
        List<Integer> countOfPages = new ArrayList<Integer>();

        long numBooks = dao.getCountBook();
        
        long result = 0;
         
        if(numBooks <= 10){
            result = 1;
        } else if((numBooks % 10) != 0) {
            result = (numBooks / 10) + 1;
        } else if((numBooks % 10) == 0){
            result = (numBooks / 10);
        } else if (numBooks == 0){
            result = 1;
        }

        for (int i = 1; i <= result; i++) {
            countOfPages.add(i);
        }
        return countOfPages;
    }

    @Override
    public List<Book> getBooksByFilter(SaerchFilterDto dto) {
        
        List<Book> listBook = new ArrayList();
        
        if(dto.getTitle() == null ){
            return listBook;
        }
        
        listBook = dao.getBookByTitle(dto.getTitle());
        
        if (!listBook.isEmpty()){
            if (dto.getIsNotReaded()!=null && dto.getIsNotReaded().equalsIgnoreCase("true")){
                listBook = getOnlyNotReaded(listBook);
            }
            if (dto.getPrintYear()!=null && !dto.getPrintYear().isEmpty()){
                try{
                    int year = Integer.valueOf(dto.getPrintYear());
                    listBook = getAfterYear(listBook , year);
                } catch (Exception ex){
                    System.err.println(ex);
                }
            }
        }
        
        return listBook;
        
    }
                
        

    private List<Book> getOnlyNotReaded(List<Book> listBook) {
        List<Book> sorted = new ArrayList();
        for (Book book : listBook){
            if (!book.isReadAlready()){
                sorted.add(book);
            }
        }
        return sorted;
    }

    private List<Book> getAfterYear(List<Book> listBook, int printYear) {
        List<Book> sorted = new ArrayList();
        for (Book book : listBook){
            if (book.getPrintYear() >= printYear){
                sorted.add(book);
            }
        }
        return sorted;
    }
    
}
