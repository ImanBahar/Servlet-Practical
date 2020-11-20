

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoginDao;

public class getMarks extends HttpServlet {
	 public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
	
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 
		 String name = request.getParameter("name");
		 String password = request.getParameter("password");
		 
		 if(LoginDao.validate(name, password)){  
		        RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
		        rd.forward(request,response);  
		    }  
		    else{  
		        out.print("Success");  
		        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
		        rd.include(request,response);  
		    }  
		          
		    out.close();
		 
		   }
	 }
