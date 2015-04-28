<%-- 
    Document   : transferenciaParaPoupanca
    Created on : 27/04/2015, 18:24:40
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
        <form method="post" action="TransferenciaParaPoupancaServlet">
            <p>Nome do cliente</p>
            <p>Valor:</p>
            <p><input type="text" name="valor" value="" placeholder="valor a ser transferido para poupanca"></p>
            <p class="submit"><input type="submit" name="commit" value="Entrar"></p>
        </form>
    </body>
</html>
