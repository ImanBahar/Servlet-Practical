

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LoginDao;

public class getMarks extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><body>"); 
		String userID = session.getAttribute("userID").toString();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?useTimezone=true&serverTimezone=UTC", "root", "aina1998");
			

			PreparedStatement stmt = conn.prepareStatement("select userID, subject, marks from user_marks where userID=?");
			stmt.setInt(1, Integer.parseInt(userID));
		  
            ResultSet rs = stmt.executeQuery(); 
            
            out.println("<table border=1 width=50% height=50%>");  
            out.println("<tr><th>Subject</th><th>marks</th><tr>");  
            
            while (rs.next()) 
            {  
                String n = rs.getString("subject");  
                int nm = rs.getInt("marks");  
//                int s = rs.getInt("sal");   
                out.println("<tr><td>" + n + "</td><td>" + nm + "</td></tr>");   
            }  
           
            out.println("</table>");  
            out.println("</html></body>");  
            conn.close();  
			
		}catch(Exception e) {
			System.out.print(e);
		}
		
		
		
			session.setAttribute("userID", userID);
			response.sendRedirect("welcome.jsp");
		}
}
