package com.Organisaction.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.ExcelUtility;
import generic.FileUtility;
import generic.JavaUtility;
import generic.WebdriverUtility;

public class CreateOrganisaction {

	public static void main(String[] args) throws Throwable {
		
		JavaUtility jLib=new JavaUtility();
		WebdriverUtility wLib=new WebdriverUtility();
		FileUtility fLib=new FileUtility();
		ExcelUtility eLib=new ExcelUtility();
		
		//int randomint=jLib.getRandomNumber();
		WebDriver driver=new ChromeDriver();
		wLib.waitUnitPageLoad(driver,5);
		driver.get(fLib.getPropertyKeyValue("url"));
		driver.findElement(By.name("user_name")).sendKeys(fLib.getPropertyKeyValue("username"));
		driver.findElement(By.name("user_password")).sendKeys(fLib.getPropertyKeyValue("password"));
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys(eLib.getDataFromExcel("org",1,2)+jLib.getRandomNumber());
		driver.findElement(By.xpath("//select[@name='industry']")).click();
		WebElement wb=driver.findElement(By.xpath("//select[@name='industry']"));
		wLib.drop(wb,"Education");
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		
		
		
		
		 
		driver.close();
	}

}
