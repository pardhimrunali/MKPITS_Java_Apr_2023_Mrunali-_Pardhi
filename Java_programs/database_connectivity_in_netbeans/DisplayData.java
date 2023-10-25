/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author as
 */
public class DisplayData extends HttpServlet {

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
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
             
                 Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "109Trupti@109");
               Statement statement = connection.createStatement();
                out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>"+ "Servlet formData</title>");            
            out.println("</head>");                                                                                       
            out.println("<body>");
            
            
            ResultSet resultSet = statement.executeQuery("select * from student");
            out.println(" <table align=center border=1 cellspacing=5>"
                    + "<tr>"
                    +"<th>Roll NO</th>"
                    +"<th>Name</th>"
                    +"<th>Address</th>"
                    +"<th>City</th>"
                    +"</tr>");
             while (resultSet.next()) {       
                    out.println("<tr>"
                    +"<td>"+resultSet.getString(1)+"</td>"
                    +"<td>"+resultSet.getString(2)+"</td>"     
                    +"<td>"+resultSet.getString(3)+"</td>"     
                    +"<td>"+resultSet.getString(4)+"</td>"     
                    + "</tr>");
            }
             out.println("</table");
              out.println("</body>"); 
             out.println("</html>");
   
            }catch(Exception e){
                out.println(e);
            }
            
             
           
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
        processRequest(request, response);
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
