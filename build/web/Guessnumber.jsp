<%-- 
    Document   : Guessnumber
    Created on : Apr 8, 2016, 7:55:20 PM
    Author     : rishi
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guess Number</title>
    </head>
    <body>

        <h1>Guess Number</h1>


        <%
           
                Random rn = new Random();
                int randomNumber = rn.nextInt(10) + 1;
                
            if(request.getParameter("randomNumber")!=null){
                randomNumber=Integer.parseInt(request.getParameter("randomNumber"));
            }

        %>


        <p><%=randomNumber%></p>
        <form action="Guessnumber.jsp">
            <input type="text" name="number"/>
            <input type="hidden" name="randomNumber" value="<%=randomNumber%>"/>
            <input type="submit" value="submit"/>

        </form>
        <%
            String number = request.getParameter("number");
            if (number == null) {
            } else {
                if (Integer.parseInt(number) < randomNumber) {%>
        <p>Too Low </p>
        <%
        } else if (Integer.parseInt(number) > randomNumber) {%>
        <p>Too High</p>
        <%
        } else {%>
        <p>Correct, congratulations!</p>
        <%
                }
            }
        %>

    </body>
</html>
