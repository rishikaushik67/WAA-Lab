<%-- 
    Document   : newjsp
    Created on : Apr 22, 2016, 6:49:42 PM
    Author     : rishi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <script type="text/javascript" src="jquery-latest.js"></script> 
        <script type="text/javascript" src="jquery.tablesorter.js"></script>
        <script>
            
            $(document).ready(function() 
    { 
        $("#myTable").tablesorter(); 
    } 
        );             
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table id="myTable" class="tablesorter"> 
<thead> 
<tr> 
    <th>Last Name</th> 
    <th>First Name</th> 
    <th>Email</th> 
    <th>Due</th> 
    <th>Web Site</th> 
</tr> 
</thead> 
<tbody> 
    
        <tr>
            <td> Th</td>
             
        </tr>
   
        <tr>
            <td> Thkd</td>
             
        </tr><tr>
            <td> hkTh</td>
             
        </tr><tr>
            <td> ukTh</td>
             
        </tr><tr>
            <td> ckTh</td>
             
        </tr>

<!--<tr> 
    <td>Smith</td> 
    <td>John</td> 
    <td>jsmith@gmail.com</td> 
    <td>$50.00</td> 
    <td>http://www.jsmith.com</td> 
</tr> -->

</tbody> 
</table> 
    
    </body>
</html>
