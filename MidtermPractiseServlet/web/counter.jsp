<%-- 
    Document   : counter
    Created on : May 2, 2016, 9:11:29 PM
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
       value: ${counter.value}
       <form action="NewServlet" method="GET" >
           <input type="submit" value="increment" />
       </form>
    </body>
</html>
