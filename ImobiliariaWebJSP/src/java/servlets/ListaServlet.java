package servlets;

import dao.ImovelDao;
import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import model.imovel.ImovelEntity;

public class ListaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ImovelEntity imovelEntity = null;
        String descricao = request.getParameter("descricao");

        List lista = null;

        try {
            ImovelDao imovelDao = new ImovelDao();
            lista = imovelDao.getLista();
            request.setAttribute("lista", lista);
            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            System.out.println("ERRROOOO "+e);  
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
