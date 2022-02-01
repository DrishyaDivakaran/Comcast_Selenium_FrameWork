package com.Organisaction.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import generic.ExcelUtility;
import generic.FileUtility;
import generic.JavaUtility;
import generic.WebdriverUtility;

public class CreateOrganisactionWithIndustry {

	public static void main(String[] args) throws Throwable {
		JavaUtility jLib=new JavaUtility();
		WebdriverUtility wLib=new WebdriverUtility();
		FileUtility fLib=new FileUtility();
		ExcelUtility eLib=new ExcelUtility();
		
		int randomint=jLib.getRandomNumber();
		
		
		WebDriver driver=new ChromeDriver();
		wLib.waitUnitPageLoad(driver,5);
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		
		String orgName = eLib.getDataFromExcel("org",1,2)+jLib.getRandomNumber();
		driver.findElement(By.name("accountname")).sendKeys(eLib.getDataFromExcel("org",1,2)+jLib.getRandomNumber());
		driver.findElement(By.xpath("//select[@name='industry']")).click();
		WebElement wb=driver.findElement(By.xpath("//select[@name='industry']"));
		wLib.drop(wb,"Education");
		
		

		
		driver.findElement(By.xpath("//select[@name='accounttype']")).click();
		WebElement induType=driver.findElement(By.xpath("//select[@name='accounttype']"));
		wLib.drop(induType,"Press");
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	    
		
		//comparing organization window heading with our organization name
		
		String orgNameCreated = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		Assert.assertTrue(orgNameCreated.contains(orgName));
		
		
		WebElement lo = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wLib.mouseOver(driver, lo);
		wLib.waitUnitPageLoad(driver, 2);
		driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).click();
		
		driver.close();
	}

}
