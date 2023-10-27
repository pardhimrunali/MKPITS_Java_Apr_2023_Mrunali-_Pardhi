/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author as
 */
public class DepositAmount extends HttpServlet {

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
            
            
             String s="Deposit";
             int addedamount= Integer.parseInt(request.getParameter("d"));
            
            out.println("<h3>Amount Deposited Successfully</h3>");
            
            try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    
                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManegement","root","109Trupti@109");
               PreparedStatement preparedStatement =connection.prepareStatement("insert into transactions values(?,?,?,?)");
               
               // add user id
               HttpSession http=request.getSession(true);
                long datevalue=http.getCreationTime();
                
                
               preparedStatement.setString(1, (String) http.getAttribute("user_id")); 
               preparedStatement.setDate(2,new java.sql.Date(datevalue)); 
               preparedStatement.setDouble(3,addedamount); 
               preparedStatement.setString(4,s);
               preparedStatement.executeUpdate();
               
               //add the balance
               
               preparedStatement =connection.prepareStatement("update  account set balance=balance+? where user_id=?");
              
               preparedStatement.setDouble(1,addedamount);
             preparedStatement.setString(2,(String) http.getAttribute("user_id"));
              int updateVlue = preparedStatement.executeUpdate();
            }
            catch(Exception e) {
                    System.out.println(e);
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
