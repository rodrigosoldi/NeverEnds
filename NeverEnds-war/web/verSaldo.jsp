<%-- 
    Document   : verSaldo
    Created on : 27/04/2015, 14:34:04
    Author     : RodrigoSoldi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Saldo Conta: </h1>
        <%
            out.println("<p>" + request.getSession().getAttribute("saldo"));
        
        %>
    </body>
</html>
