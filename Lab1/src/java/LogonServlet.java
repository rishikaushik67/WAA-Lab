/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rishi
 */
public class LogonServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LogonServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LogonServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        PrintWriter out = response.getWriter();

         String userName = request.getParameter("username");
        String password = request.getParameter("password");
       if(userName!=null&&password!=null&&userName.equals("user")&&password.equals("pass")){
            out.print("welcome User");
           return;
            
        }else if(userName!=null&&password!=null){
           out.println("<h1>Wrong UserId or Password! Please Try Again</h1>");
       }
        out.println("<html>");
        out.println("<body>");
        out.println("<form method=GET action=LogonServlet>");
        out.println("Username=<input type=text name=username> <br>");
        out.println("Password=<input type=text name=password>");
        out.println("<input type=submit value='Logon'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
        

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
