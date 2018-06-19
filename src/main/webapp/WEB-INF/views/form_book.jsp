<%-- 
    Document   : create_book
    Created on : 16.06.2018, 18:05:47
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create book</title>
    </head>
    <body>
        <div style="margin:0 auto; max-width: 900px; width:100%">
            <h3>Create book</h3>
        <form method="post" action="send_book">
               <h3>Title</h3>
               <div>
                   <input type="text" name="title" style="width: 100%; height: 20px" required="required">
               </div>
               <h3>Description</h3>
               <div>
                   <textarea name="description" style="width: 100%; height: 50px" required="required"></textarea>
               </div>
               <h3>Author</h3>
               <div>
                   <input type="text" name="author" style="width: 100%; height: 20px" required="required">
               </div>
               <h3>Isbn</h3>
               <div>
                   <input type="text" name="isbn" style="width: 100%; height: 20px" required="required">
               </div>
               <h3>PrintYear</h3>
               <div>
                   <input type="text" name="printYear" style="width: 100%; height: 20px" required="required">
               </div>
               <input type="hidden" name="readAlready" value="false">
               <div>
                   <input type="submit" style="width: 100%; height: 30px; color: blue">
               </div>
            
        </form>
        </div>
    </body>
</html>
