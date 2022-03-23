package com.crm.CalenderPopupHandling;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDateCalenderTest {


		@Test
		public void Calender()
		{
			WebDriver driver=new ChromeDriver();
			/*below set up is used for get the correct version of the browser
			[already we are mention the dependency in pom.xml*/
			WebDriverManager.chromedriver().setup();
			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com/");
			Actions action=new Actions(driver);
			action.moveByOffset(10,10).click().perform();
			driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
			driver.findElement(By.xpath("//label[@for='departure']")).click();
			
			//Wait<WebDriver> fkk = new FluentWait<WebDriver>(driver)
					
			
			
			
			
			

	}

}
