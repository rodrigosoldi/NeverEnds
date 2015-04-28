<%-- 
    Document   : verExtrato
    Created on : 27/04/2015, 18:08:37
    Author     : RodrigoSoldi
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BANCO NEVER ENDS</title>
    </head>
    <body>
        <h1>Extrato</h1>
        <%
            List<Object[]> list = (List)request.getAttribute("extrato");
            for (Object[] item : list) {
                Calendar data = (GregorianCalendar)item[0];
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                float valor = (float)item[1];
                out.println(dateFormat.format(data.getTime()));
                
                out.println(" - R$ ");
                out.println(item[1]);
                out.println("<br>");
            }
        %>
    </body>
</html>
