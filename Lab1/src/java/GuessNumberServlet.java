/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rishi
 */
public class GuessNumberServlet extends HttpServlet {

    Random rn = new Random();
int randomNumber = rn.nextInt(10) + 1;

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
            out.println("<title>Servlet guessNumberServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet guessNumberServlet at " + request.getContextPath() + "</h1>");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Double numberEntered = null;
        if (request.getParameter("guessnumber") != null) {
            numberEntered = Double.parseDouble(request.getParameter("guessnumber"));
        }
        
        if (numberEntered != null) {
            if (numberEntered == randomNumber) {
                out.print("<h1>Correct, congratulations!<h1> ");
                return;

            } else if (numberEntered < randomNumber) {
                out.println("<h1>Too Low</h1>");
            } else {
                out.println("<h1>Too High</h1>");
            }
        }
        out.println("<html>");
        out.println("<body>");
        out.println("<form method=GET action=guessNumberServlet>");
        out.println("Guess Number=<input type=text name=guessnumber> <br>");
        out.println("<input type=submit value='submit'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        
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
        processRequest(request, response);
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
