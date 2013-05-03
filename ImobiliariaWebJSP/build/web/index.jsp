<%-- 
    Document   : index
    Created on : 01/05/2013, 16:08:24
    Author     : Marlon
--%>

<%@page import="model.imovel.ImovelEntity"%>
<%@ page import="java.util.List" %>  
<html>  
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <title>Alunos</title>  
    </head>  
    <body>  
        <h1>Lista de alunos</h1>  
        <table>  
            <tr>  
                <td>Nome</td>  
                <td>Curso</td>  
            </tr>  
            <%
                List lista = (List) request.getAttribute("lista");
                
                for (int i = 0; i < lista.size(); i++) {
            %>  
            <tr>   
                <td> <%=((ImovelEntity) lista.get(i)).getDescricao()  %> </td>  
            </tr>    
            <%
                }
            %>  
        </table>       
    </body>  
</html>  