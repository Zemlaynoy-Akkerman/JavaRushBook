/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zemlaynoy.javarush.dao;

import com.zemlaynoy.javarush.config.HibernateSessionFactoryUtil;
import com.zemlaynoy.javarush.entity.Book;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;



/**
 *
 * @author alex
 */

@Repository
public class BookDAOImpl implements BookDAO{
    


    @Override
    public Book findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Book.class, id);
    }

    @Override
    public void save(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(book);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(book);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(book);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Book> findAll() {
        
        List<Book> users = (List<Book>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from Book").list();
        return users;
    }

    @Override
    public List<Book> searchBooks(int year) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Book where printYear = :printYear");
        q.setParameter("printYear", year);
        return q.list();
    }

    @Override
    public List<Book> getBookLimit(int first, int last) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Book");
        q.setFirstResult(first);
        q.setMaxResults(last);
        return q.list();
    }

    @Override
    public long getCountBook() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        int numBooks = ((Long)session.createQuery("select count(*) from Book").uniqueResult()).intValue();
        return numBooks;
    }

    @Override
    public List<Book> getBookByTitle(String title) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Book where title like :title");
        q.setParameter("title", "%" + title + "%");
        return q.list();
    }
}
