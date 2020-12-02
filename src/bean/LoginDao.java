package bean;

import java.sql.*;  
  
public class LoginDao {  
	public static boolean validate(String name,String pass){  
		boolean status=false;  
			
		try{  
			Class.forName("com.mysql.jdbc.Driver").newInstance();  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/db1?useTimezone=true&serverTimezone=UTC","root","aina1998");  
			      
			PreparedStatement ps=con.prepareStatement("select * from user_data where name=? and password=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
			      
			ResultSet rs=ps.executeQuery();  
			status=rs.next();  
			          
			}catch(Exception e){System.out.println(e);}  
		
			return status;  
	}  
	
	public static String getID(String name, String pass) {
		String userID = null;
		
		try{  
			Class.forName("com.mysql.jdbc.Driver").newInstance();  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/db1?useTimezone=true&serverTimezone=UTC","root","aina1998");  
			      
			PreparedStatement ps=con.prepareStatement("select * from user_data where name=? and password=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
			      
			ResultSet rs=ps.executeQuery();  
			while(rs.next()) {
				int userID1 = rs.getInt("userID");
				userID = Integer.toString(userID1);
			}
			          
			}catch(Exception e){System.out.println(e);}  
		
		return userID;
	}
}