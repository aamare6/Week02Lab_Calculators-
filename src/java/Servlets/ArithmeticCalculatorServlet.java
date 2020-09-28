
package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response); 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         //parameters
        String operator = request.getParameter("calc");
        String firstNumber = request.getParameter("first");
        String secondNumber = request.getParameter("second");
        
        
        //attributes
       request.setAttribute("firstNum", firstNumber);
       request.setAttribute("secondNum", secondNumber);
       
       
       int answer = 0;
       String displayAnswer = "";
       String defaultAnswer = "Result: ---";
       
       if (firstNumber != null || !firstNumber.equals("")|| secondNumber != null || !secondNumber.equals("") ) {
       try { 
       int first = Integer.parseInt(firstNumber);
       int second = Integer.parseInt(secondNumber);
       
       switch(operator) {
           case "+":
               answer = (first + second);
               break;
           case "-":
               answer = (first - second);
               break;
               
           case "*":
               answer = (first * second);
               break;
           case "%":
               answer = (first % second);
               break;
               
           default:
            request.setAttribute("arithMessage", defaultAnswer);
               break;
               
            
         
       }
        displayAnswer = "Result: " + answer; 
       
       }catch (Exception e) {
       displayAnswer = "invalid";
       
       }
       
       
       }
     
          request.setAttribute("arithMessage", displayAnswer);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
         
       
        
      
    }

 

}
