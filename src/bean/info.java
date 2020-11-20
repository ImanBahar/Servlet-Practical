package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class info {

	Connection con;
	
	public Connection getConn() {
		try{  
			Class.forName("com.mysql.jdbc.Driver").newInstance();  
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/db1?useTimezone=true&serverTimezone=UTC","root","aina1998");  
 
			          
			}catch(Exception e){System.out.println(e);}  
	return con;
	}
}
