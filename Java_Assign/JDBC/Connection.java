package org.com.Capgemini3;
import java.sql.*;
public class Connection {
public static void main(String args[])
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		java.sql.Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");  
		//step3 create the statement object  
		Statement stmt=con.createStatement();  
		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
			System.out.println(rs.getString("EMPNO")+"  "+rs.getString("ENAME")+"  "+rs.getString("SAL"));  
		//step5 close the connection object  
		con.close();  
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
