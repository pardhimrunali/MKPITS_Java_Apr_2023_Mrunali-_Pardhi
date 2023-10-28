/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author as
 */
public class Statement extends HttpServlet {

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
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManegement","root","109Trupti@109");
            
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>"+ "Statement</title>");            
            out.println("</head>");                                                                                       
            out.println("<body>");
            
            
           PreparedStatement preparedStatement =connection.prepareStatement("Select * from transactions where user_id=?");
            HttpSession httprs=request.getSession(true);
            preparedStatement.setString(1, (String) httprs.getAttribute("user_id")); 
               
            ResultSet resultSet = preparedStatement.executeQuery();
            out.println("<h1><center>Statements</center></h1>");
             out.println(" <table align=center border=1 cellspacing=0 cellpadding=10>"
                    + "<tr>"
                    +"<th>user Id</th>"
                    +"<th>transaction Date</th>"
                    +"<th>Amount</th>"
                    +"<th>Transaction Type</th>"
                    +"</tr>");
                    while (resultSet.next()) {       
                    out.println("<tr>"
                    +"<td>"+resultSet.getString(1)+"</td>"
                 
                    +"<td>"+resultSet.getDate(2)+"</td>"     
                    +"<td>"+resultSet.getString(3)+"</td>"     
                    +"<td>"+resultSet.getString(4)+"</td>"     
                    + "</tr>");
            }
                    
                    preparedStatement =connection.prepareStatement("Select balance from account where user_id=?");
             preparedStatement.setString(1, (String) httprs.getAttribute("user_id")); 
          resultSet=  preparedStatement.executeQuery();
           
                    while (resultSet.next()) {       
                    out.println("<tr>"
                
                  +"<td colspan=2></td>"
                        
                    +"<td >"+"Total="+resultSet.getDouble(1)+"</td>"
                            +"<td></td>"
                    + "</tr>");
            }
            
            out.println("</table");
              out.println("</body>"); 
             out.println("</html>");
            }
            
         catch(Exception e){
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
