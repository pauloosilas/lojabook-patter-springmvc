<%-- 
    Document   : form
    Created on : 10/01/2017, 21:25:46
    Author     : paulo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form method="post" action="/lojabook-patter/produtos">
            <div>
                <label for="title">Titulo</label>
                <input type="text" name="title" id="title"/>
            </div>
            <div>
                <label for="description">Descrição</label>
                <textarea rows="10" cols="20" name="description"
                          id="description">
                </textarea>
            </div>
            <div>
                <label for="pages">Número de paginas</label>
                <input type="text" name="pages" id="pages"/>
            </div>
            <div>
                <input type="submit" value="Enviar">
            </div>
        </form>
</html>
