package GenUtilityAPI;
import static io.restassured.RestAssured.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseApiClass {
	

	public DataBaseUtility dUtil=new DataBaseUtility();
	public JavaUtility jUtil=new JavaUtility();
	
	@BeforeSuite
	public void bscofig()
	{
		
		System.out.println("DB connection stsrted");
		dUtil.connToDB();
	     baseURI="http://localhost";
		port=8084;
		System.out.println("DB established");
		
		
		
	}
	
	@AfterSuite
	public void asConfi() {
		dUtil.closeDB();
		System.out.println("DB  is not coccected");
	}
	

}
