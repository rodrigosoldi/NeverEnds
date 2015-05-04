<%-- 
    Document   : verSaldo
    Created on : 27/04/2015, 14:34:04
    Author     : RodrigoSoldi
--%>

<%@page import="conta.ContaCorrente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <%                        
            ContaCorrente contaCorrente = (ContaCorrente)request.getSession().getAttribute("contaCorrente");
            
            out.println("<h1>Seja bem vindo: "+contaCorrente.getCliente().getNome()+"</h1>");
            
            out.println("<br><br><h2>O saldo da sua conta é de: R$" + contaCorrente.getSaldo()+"</h2>");
        
        %>
    </body>
</html>
