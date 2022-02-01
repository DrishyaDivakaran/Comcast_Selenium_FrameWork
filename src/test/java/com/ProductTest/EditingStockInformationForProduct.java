package com.ProductTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditingStockInformationForProduct {
	WebDriver driver;
	@BeforeClass 	
	public void openBrowser(){
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}



	@Test (priority=1)
	public void login()
	{
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	}


	@Test (priority=2)
	public void search()
	{
		driver.findElement(By.linkText("Products")).click();
		WebElement product=driver.findElement(By.xpath("(//select[@id='bas_searchfield'])[1]"));
		Select s=new Select(product);
		s.selectByValue("productname");
		System.out.println("Search");
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("Keyboard");
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	}


	@Test (priority=3)
	public void edit() throws InterruptedException
	{
		driver.findElement(By.xpath("(//input[@name='Edit'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='qtyinstock']")).sendKeys("28");
		driver.findElement(By.xpath("//input[@name='qty_per_unit']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name='reorderlevel']")).sendKeys("1354");
		driver.findElement(By.xpath("//input[@name='qtyindemand']")).sendKeys("14");
		WebElement box=driver.findElement(By.xpath("//select[@name='usageunit']"));
		Select s1=new Select(box);
		s1.selectByValue("Pack");
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Thread.sleep(2000);
	}


	@Test (priority=10)
	public void logout() {
		System.out.println("logouting process");
		driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]")).click();
		driver.findElement(By.linkText("Sign Out")).click();
	}


}


