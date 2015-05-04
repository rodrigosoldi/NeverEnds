<%-- 
    Document   : verExtrato
    Created on : 27/04/2015, 18:08:37
    Author     : RodrigoSoldi
--%>

<%@page import="transacao.Transacao"%>
<%@page import="conta.ContaCorrente"%>
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
        <a href="mainConta.jsp">Voltar</a>
        <h1>Extrato</h1>
        <%
            ContaCorrente contaCorrente = (ContaCorrente)request.getSession().getAttribute("contaCorrente");
            
            List<Transacao> list = contaCorrente.getTransacoes();
            for (Transacao item : list) {
                Calendar data = item.getDataTransacao();
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                out.println(dateFormat.format(data.getTime()));                
                out.println(" - R$ ");
                out.println(item.getValor());
                out.println("<br>");
            }
        %>
    </body>
</html>
