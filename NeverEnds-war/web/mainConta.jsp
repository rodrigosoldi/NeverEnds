<%-- 
    Document   : mainConta
    Created on : 27/04/2015, 14:30:24
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
        <h1>Bem vindo!</h1>
        <h2><%ContaCorrente c = (ContaCorrente)request.getSession().getAttribute("contaCorrente");
            out.println("<p>"+c.getCliente().getNome()+"</p><br>");
        %></h2>
        
        <p><a href="verSaldo.jsp">Ver Saldo (Caso de Uso 1)</a></p>
        <p><a href="agendarDebitoAutomatico.jsp">Agenda Débito Automático (Caso MVP)</a></p>
        <p><a href="ConsultaExtratoServlet">Consultar extrato (Caso de Uso 2)</a></p>
        <p><a href="transferenciaParaPoupanca.jsp">Transferencia para poupanca</a></p>
        
    </body>
</html>
