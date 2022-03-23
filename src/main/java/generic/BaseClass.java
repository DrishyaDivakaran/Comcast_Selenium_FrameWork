package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.crm.comcast.objectrepository.Home;
import com.crm.comcast.objectrepository.Login;

public class BaseClass {
	              //Object creation
			public FileUtility fLib=new FileUtility();
			public ExcelUtility eLib=new ExcelUtility();
			public JavaUtility jLib=new JavaUtility();
			public WebdriverUtility wLib=new WebdriverUtility();
			public WebDriver driver=null;
			
			@BeforeSuite
			public void configBS()
			{
				System.out.println("=========dDB CONNECTED============");
				
              }
			
			@AfterSuite
			public void configAS()
			{
				System.out.println("========DB CONNECTION CLOSED=======");	
			}
			
			
			
			//@Parameters("browser")			
			@BeforeClass
			
			public void configBC() throws Throwable
			{			
			if(fLib.getPropertyKeyValue("browser").equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(fLib.getPropertyKeyValue("browser").equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(fLib.getPropertyKeyValue("browser").equals("ie"))
			{
				driver=new InternetExplorerDriver();
			}
			else {
				driver=new ChromeDriver();
			}
			}
			
			
			//Passing arguments in parameters
				
			/*public void configBC(String browser) throws Throwable
				{
				if(browser.equals("chrome"))
				{
					driver=new ChromeDriver();
				}
				else if(browser.equals("firefox"))
				{
					driver=new FirefoxDriver();
				}
				else {
					driver=new ChromeDriver();
				}
			}*/
			
			@BeforeMethod
			public void configBM() throws Throwable
			{
				String BROWSER=fLib.getPropertyKeyValue("browser");
				String URL=fLib.getPropertyKeyValue("url");
				String UN=fLib.getPropertyKeyValue("username");
				String PW=fLib.getPropertyKeyValue("password");
				driver.get(URL);
				
				
				Login lp=new Login(driver);
				lp.loginApp(fLib.getPropertyKeyValue("username"),fLib.getPropertyKeyValue("password"));

			}
	     /*   @AfterClass
	         public void configAc()
	          {
		       driver.close();
	           }*/
	        
	        @AfterMethod
	        public void configAM()
			{
	        	Home hp=new Home(driver);
				hp.getSignOut();
			} 
	}


