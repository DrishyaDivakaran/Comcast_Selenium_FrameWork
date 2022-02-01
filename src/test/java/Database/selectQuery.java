package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class selectQuery {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try
		{
		Driver  driverref=new Driver();
		//register my sql
		DriverManager.registerDriver(driverref);
		
		//connect to db
	        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
   		System.out.println("Connection is done");
		
		//create query statement
		Statement state=conn.createStatement();
		String query ="select * from project";
		
		//execute the query
		 ResultSet resultset=state.executeQuery(query);
		 
		 while(resultset.next())
		 {
			 System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4));
		 }
		}
		
		 catch(Exception e)
		 {
			 
		 }
		 finally
		 {
			
			//close the connection
			 conn.close();
			 System.out.println("____________Connection closed___________");
			 
		 }
	}

}
