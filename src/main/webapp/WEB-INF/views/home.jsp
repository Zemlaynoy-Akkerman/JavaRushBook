<%-- 
    Document   : home
    Created on : 01.06.2018, 23:11:39
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book</title>
    </head>
    <body>
        <h3>
            <a href="${pageContext.request.contextPath}/form_book">Сreate a book</a>
        </h3>
        <h3>
            <a href="${pageContext.request.contextPath}/form_search">Go to search</a>
        </h3>
        
        <c:choose>
                <c:when test="${!empty books}">                
                    <table border="1">
                        <tr>
                            <th><p>ID</p></th>
                            <th><p>Title</p></th>
                            <th><p>Description</p></th>
                            <th><p>Author</p></th>
                            <th><p>Isbn</p></th>
                            <th><p>PrintYear</p></th>
                            <th><p>ReadAlready</p></th>
                            <th><p>Read</p></th>
                            <th><p>Edit</p></th>
                            <th><p>Delete</p></th>
                        </tr>
                        <c:forEach var="book" items="${books}">
                            <tr>
                                <th>${book.getId()}</th>
                                <th>${book.getTitle()}</th>
                                <th>${book.getDescription()}</th>
                                <th>${book.getAuthor()}</th>
                                <th>${book.getIsbn()}</th>
                                <th>${book.getPrintYear()}</th>
                                <th>${book.isReadAlready()}</th>
                                <th>
                                <c:choose>
                                    <c:when test="${book.isReadAlready() == false}">                   
                                          <a href="${pageContext.request.contextPath}/change_readAlready_book?id=${book.getId()}">Read</a>
                                    </c:when>
                                </c:choose>
                                </th>
                                <th><a href="${pageContext.request.contextPath}/book_edit_record?id=${book.getId()}">Edit</a></th>
                                <th><a href="${pageContext.request.contextPath}/delete_book?idBook=${book.getId()}">Delete</a></th>
                            </tr>
                        </c:forEach>
                    </table>
                    <c:forEach var="page" items="${numberPage}">
                        <a href="?page=${page}">${page}</a>
                    </c:forEach>
                </c:when>
        <c:otherwise>
            <h2>No books found</h2>
        </c:otherwise>
            
    </c:choose> 
</body>
</html>