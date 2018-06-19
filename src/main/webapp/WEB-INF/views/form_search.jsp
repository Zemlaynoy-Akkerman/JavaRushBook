<%-- 
    Document   : form_search
    Created on : 17.06.2018, 14:59:14
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search book</title>
    </head>
    <body>
        <div style="margin:0 auto; max-width: 900px; width:100%">
            <div style="text-align: center">
            <form method="post" action="search">
                <div>
                    <p>Enter Title</p>
                   <input type="text" name="title" style="width: 40%; height: 20px" required="required">
                </div>
                <div>
                    <p>Year</p>
                   <input type="text" name="printYear" style="width: 40%; height: 20px">
                </div>
                <div>
                    <input type="checkbox" name="isNotReaded" value="true" checked>Is not Readed<br>
                </div>
                <br>
                <div>
                    <input type="submit" value="search" style="width: 40%; height: 20px; color: blue">
                </div>
            </form>
                <br>
                <a href="${pageContext.request.contextPath}/home">Go to Home</a>
            </div>
            
        </div>    
        
    </body>
</html>
