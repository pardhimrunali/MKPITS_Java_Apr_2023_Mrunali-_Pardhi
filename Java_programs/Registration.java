/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author as
 */
public class Registration extends HttpServlet {

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
        
        String user_id=request.getParameter("user_name");
               String password=request.getParameter("p_name");
                String name=request.getParameter("name");
                 String address=request.getParameter("addr");
                String city_name=request.getParameter("city");
                String emailid=request.getParameter("mail");
                 String balance=request.getParameter("balance");
                
                
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManegement", "root", "109Trupti@109");
                
                   PreparedStatement preparedStatement =connection.prepareStatement("insert into account values(?,?,?,?,?,?,?)");
            preparedStatement.setString(1,user_id );
            preparedStatement.setString(2,  password);
             preparedStatement.setString(3, name);
              preparedStatement.setString(4, address);
          preparedStatement.setString(5,city_name);
              preparedStatement.setString(6,emailid);
                  preparedStatement.setString(7,balance);
                   preparedStatement.executeUpdate();
          out.println("Data Inserted Succesfully");
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
