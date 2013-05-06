package servlets;

import dao.ImovelDao;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import model.imovel.ImovelEntity;

public class ListaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ImovelEntity imovelEntity = null;
        ImovelDao imovelDao = new ImovelDao();
        
        if(request.getParameter("radios") != null) {
            if(request.getParameter("radios").equals("alugar")) {
                try {            
                    request.setAttribute("lista", imovelDao.getAlugarList());
                } catch (Exception e) {
                    System.out.println("ERRROOOO "+e);  
                }  
            }
            if(request.getParameter("radios").equals("comprar")) {
                try {            
                    request.setAttribute("lista", imovelDao.getComprarList());
                } catch (Exception e) {
                    System.out.println("ERRROOOO "+e);  
                } 
            }
        }

              
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
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
