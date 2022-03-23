package GenUtilityAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;



public class DataBaseUtility {
	public Connection conn=null;
	
	public void connToDB()
	{
		Driver driver;
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/*
	 * 
	 */
	
	public void closeDB()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	/*
	 * this method will return data
	 */
	
	public ResultSet dataReturn(String query)
	{
		ResultSet result = null;
		
		 try {
			result= conn.createStatement().executeQuery(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			return result;
	}
	
	/*
	 * 
	 */
	
	   public void validationDB(String query,int columNum,String ExpecData) throws Throwable
	   {
			ResultSet result=conn.createStatement().executeQuery(query);
			boolean flag=false;
			String actData=null;
			while(result.next())
			{
				 try 
				 {
					 if(result.getString(columNum).equals(ExpecData))
					 {
						 System.out.println(result.getString(columNum));
						 flag=true;
						 actData=result.getString(columNum);
						 break;
					 }
				 }
				 
					 catch (Exception e) {
							
							e.printStackTrace();
						}
			}
			if(flag)
			{
				System.out.println("data verifide");
			}
			else
			{
				System.out.println("data not verifide");
			}
		 
	   }

	

}
