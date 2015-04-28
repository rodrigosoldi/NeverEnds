<%-- 
    Document   : agendarDebitoAutomatico
    Created on : 28/04/2015, 16:52:36
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
        <form method="POST" action="DebitoAutomaticoServlet">
            Codigo de Barras: <input type="text" name="codigoDeBarras" value="" /><br>
            Data: <input type="date" name="codigoDeBarras" value="" /><br>
            Valor: <input type="text" name="valor" value="" /><br>
            
            <input type="submit" value="Agendar" />
        </form>
    </body>
</html>
