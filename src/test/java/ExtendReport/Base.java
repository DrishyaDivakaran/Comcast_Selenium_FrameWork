package ExtendReport;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base {
	private static final String ExtendsparkReporter = null;

	@BeforeSuite
	
	public void configBS()
	{
		System.out.println("=========dDB CONNECTED============");
		
		//extendReport conguration
		ExtentSparkReporter 
		
		
      }
	
	@AfterSuite
	public void configAS()
	{
		System.out.println("========DB CONNECTION CLOSED=======");	
	}
	
	
	

}
