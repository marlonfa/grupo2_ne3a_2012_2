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
        <link rel="stylesheet" type="text/css" href="resources/css/style.css" />
        <title>Imobiliária</title>  
    </head>  
    <body>  
        <div id="divCabecalho"><h1>..::Seja Bem Vindo ao Sistema Imobiliária::..</h1></div>  
        <div id="divCorpo">
            <form action="ListaServlet" method="POST">
                <div id="divPesquisa">
                    Pesquisar Imóvel para:
                    <input type="radio" name="radios" value="alugar">Alugar
                    <input type="radio" name="radios" value="comprar">Comprar
                    <input type="submit" value="Pesquisar">
                </div>
                <div id="divTabela">
                    <table>  
                        <%
                            if (request.getAttribute("lista") != null) {
                        %>
                        <tr>  
                            <th>Logradouro</th>
                            <th>Número</th>
                            <th>Bairro</th>
                            <th>Complemento</th>
                            <th>Município</th>
                            <th>Estado</th>
                            <th>Descrição</th>
                            <th>Valor</th>

                        </tr>  
                        <%                    } else {
                                out.println("<h1>Nenhum Imóvel Pesquisado!</h1>");
                            }
                        %>
                        <%
                            if ((List<ImovelEntity>) request.getAttribute("lista") != null) {
                                List<ImovelEntity> lista = (List<ImovelEntity>) request.getAttribute("lista");
                                for (ImovelEntity imovel : lista) {


                        %>  
                        <tr>   
                            <td> <%=imovel.getEndereco().getLogradouro()%> </td> 
                            <td> <%=imovel.getEndereco().getNumero()%> </td> 
                            <td> <%=imovel.getEndereco().getBairro()%> </td> 
                            <td> <%=imovel.getEndereco().getComplemento()%> </td>
                            <td> <%=imovel.getEndereco().getMunicipio()%> </td>
                            <td> <%=imovel.getEndereco().getUf()%> </td>
                            <td> <%=imovel.getDescricao()%> </td>
                            <td>R$ <%=imovel.getValor()%> </td>
                        </tr>    
                        <%           }
                            }
                        %>  
                    </table>  
                </div>
                <div id="divContato">
                    Faça uma solicitação de chave para visitar o seu futuro imóvel, envie-nos
                    um e-mail dizendo qual imóvel deseja visitar.
                    <a href="mailto:fearsoft@contato.com.br" />fearsoft@contato.com.br</a>
                </div>
            </form>
        </div>
        <div id="divRodape">
            ___________________________________________________________________________________________________<br />
            Desenvolvido por FEARSOFT - 2013 <br /><br />

        </div>
    </body>  
</html>  


