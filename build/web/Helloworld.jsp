<%-- 
    Document   : Helloworld
    Created on : Apr 8, 2016, 7:53:42 PM
    Author     : rishi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
         <% 
        for(int i=0;i<=10;i++){%>
        
        <p><%=i%></p> 
        <% }%>
    </body>
</html>
