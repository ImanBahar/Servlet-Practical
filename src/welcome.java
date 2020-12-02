import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  
  
public class welcome extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
       
    HttpSession session=request.getSession(false);  
    String userID = (String)session.getAttribute("userID");   
    
    String n=request.getParameter("name");  
    out.print("Welcome "+n);  
    
    RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
    rd.forward(request,response);  
          
    
    out.close();  
    }  
  
} 