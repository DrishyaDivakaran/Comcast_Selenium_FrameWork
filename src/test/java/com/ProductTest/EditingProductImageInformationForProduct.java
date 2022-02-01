package com.ProductTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditingProductImageInformationForProduct {
	       WebDriver driver;
	       
	      @BeforeClass
	      public void login()
	       {
			 driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       }
	        
			@Test
			public void openBrowser()
			{
			driver.get("http://localhost:8888");
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
			}
			
			
			
			@Test (priority=2)
			public void search() {
				
			driver.findElement(By.linkText("Products")).click();
			WebElement product=driver.findElement(By.xpath("(//select[@id='bas_searchfield'])[1]"));
			Select s=new Select(product);
			s.selectByValue("productname");
			System.out.println("Entering and editing  ");
			driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
			driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("Keyboard");
			driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
			driver.findElement(By.xpath("(//input[@name='Edit'])[1]")).click();
			}
			
			@Test  (priority=3)
			public void addImage()
			{
				
			Actions a=new Actions(driver);
			WebElement lo=driver.findElement(By.xpath("//input[@id='my_file_element']"));
			a.click(lo).perform();
			
			
			
			
			
			//a.sendKeys("‪C:\\Users\\drish\\Documents\\TC25\\Keyboard.jpg");
			
			
			
			
			//driver.findElement(By.xpath("//input[@name='file_1']")).click();
			//driver.findElement(By.xpath(""))
			
			
			/*System.out.println("logouting process");
			//WebElement Logout=
			driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]")).click();
			//Select s1=new Select(Logout);
			//s1.selectByIndex(1).click();
			driver.findElement(By.linkText("Sign Out")).click();
			
			
			
			
			
			//driver.findElement(By.xpath("//input[@class='txtBox']")).;   */

		}

	} 


