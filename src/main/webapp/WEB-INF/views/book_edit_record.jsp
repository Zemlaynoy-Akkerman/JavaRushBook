<%-- 
    Document   : book_edit_record
    Created on : 16.06.2018, 21:14:22
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit book</title>
    </head>
    <body>
        <div style="margin:0 auto; max-width: 900px; width:100%">
            <h3>Edit book</h3>
        <form method="post" action="update_book">
               <input type="hidden" name="id" value="${book.getId()}">
               <h3>Title</h3>
               <div>
                   <input type="text" name="title" value="${book.getTitle()}" style="width: 100%; height: 20px" required="required">
               </div>
               <h3>Description</h3>
               <div>
                   <textarea name="description" style="width: 100%; height: 50px" required="required">${book.getDescription()}</textarea>
               </div>
               <div>
                   <input type="hidden" name="author" value="${book.getAuthor()}" style="width: 100%; height: 20px">
               </div>
               <h3>Isbn</h3>
               <div>
                   <input type="text" name="isbn" value="${book.getIsbn()}" style="width: 100%; height: 20px" required="required">
               </div>
               <h3>PrintYear</h3>
               <div>
                   <input type="text" name="printYear" value="${book.getPrintYear()}" style="width: 100%; height: 20px" required="required">
               </div>
                   <input type="hidden" name="readAlready" value="${book.isReadAlready()}">    
               <div>
                   <input type="submit" style="width: 100%; height: 30px; color: blue">
               </div>
            
        </form>
        </div>
    </body>
</html>
