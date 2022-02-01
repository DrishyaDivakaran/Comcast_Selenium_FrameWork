package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class UnitTesting {

	@Test
	public  void uniTesting() throws Throwable {
		String ProjectName="drishya";
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
		 boolean flag=false;
		 
		 while(resultset.next())
		 {
			 String actProjectName=resultset.getString(4);
			 if(actProjectName.equals(ProjectName))
				 flag=true;
		 }
		
		Assert.assertTrue(flag);
		}
		
		 catch(Exception e)
		 {
			 
		 }
		finally
		{
			conn.close();

           System.out.println("-------------stop--------------");
		}
		

	}

}
