/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 844817
 */
public class AgeCalculatorServlet extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String age = request.getParameter("userAge");
        request.setAttribute("ageInput", age);
        int ageNextYear;

        String output = "";
            if (age == null || age.equals("")) {
              output = "You must give your current age.";
            } else if (age != null) {
                try {
                 int ageEntered = Integer.parseInt(age);
                ageNextYear = ageEntered + 1;
                 output =  "Your age next  birthday will be " + ageNextYear; 
                } catch (NumberFormatException e) {
                output = "You must enter a number.";
                
                }
            }
            
            request.setAttribute("Message", output);
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
        }
    
 
    
 }


        
        
  