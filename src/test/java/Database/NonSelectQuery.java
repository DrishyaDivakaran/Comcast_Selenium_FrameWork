package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQuery {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		int result=0;
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
		String query="insert into project values('TY_PROJ_004','RenukaP','12/01/2022','Sandeep','on going',10)";
		result=state.executeUpdate(query);
		//execute the query
		 ResultSet resultset=state.executeQuery(query);
		 
		 
		}
		
		 catch(Exception e)
		 {
			 
		 }
		finally
		{
			if(result==1)
			{
				System.out.println("project insert succesfully");
			}
			else
			{
				System.out.println("project is not inserted");
			}
			conn.close();
			System.out.println("---------------close-------------------");
				
		}

	}

}
