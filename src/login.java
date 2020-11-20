import  bean.LoginDao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login extends HttpServlet {
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
		        out.print("Sorry username or password error");  
		        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
		        rd.include(request,response);  
		    }  
		          
		    out.close();
		 
		   }
	 }