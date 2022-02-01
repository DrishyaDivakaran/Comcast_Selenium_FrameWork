package com.crm.comcast.orgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import com.crm.comcast.objectrepository.Home;
import com.crm.comcast.objectrepository.Login;
import com.crm.comcast.objectrepository.Organizations;

import generic.ExcelUtility;
import generic.FileUtility;
import generic.JavaUtility;
import generic.WebdriverUtility;


public class CreateOrgTest {

	public static void main(String[] args) throws Throwable {
		
		//Object creation
		FileUtility fLib=new FileUtility();
		ExcelUtility eLib=new ExcelUtility();
		JavaUtility jLib=new JavaUtility();
		WebdriverUtility wLib=new WebdriverUtility();
		
		//read  data from property file
		String BROWSER=fLib.getPropertyKeyValue("browser");
		String URL=fLib.getPropertyKeyValue("url");
		String UN=fLib.getPropertyKeyValue("username");
		String PW=fLib.getPropertyKeyValue("password");
		
		//launch the browser
		WebDriver driver=null;
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
		
		//entering the url		
	     driver.get(URL);
		
		
		//Step 1 : Login to application
		Login lp=new Login(driver);
		lp.loginApp(fLib.getPropertyKeyValue("username"),fLib.getPropertyKeyValue("password"));
		
		
		//navigate to organization 
		Home hp=new Home(driver);
		hp.getOrganizationalLink().click();
		
		
		//click the create organization page
		Organizations o=new Organizations(driver);
		o.getCreatOrg().click();
		wLib.waitUnitPageLoad(driver,5);                         
	
		//check whether the organization Page displayed or not
		String pageOrgDisplayed=driver.getTitle();
		System.out.println(pageOrgDisplayed);
		String orgPage =o.getOrgText().getText();
		if(pageOrgDisplayed.contains(orgPage)) {
			System.out.println("Organization Page Navigated");
		}
		else {
			System.out.println("Organization Page Not Navigated");
		}
		
		//fetching values from excel
		String orgName = eLib.getDataFromExcel("org", 1, 1)+jLib.getRandomNumber();
		o.getNameOrg().sendKeys(orgName);
		o.getSaveMe().click();
		System.out.println("organization name  succfully fetch from excel");
		driver.close();
	}

}
