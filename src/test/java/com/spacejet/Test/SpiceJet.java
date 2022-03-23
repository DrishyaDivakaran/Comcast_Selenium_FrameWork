package com.spacejet.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SpiceJet {
  
	@Test
	public void my() throws InterruptedException
   {
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions op=new ChromeOptions();
	   op.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.spicejet.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
	     driver.findElement(By.xpath("//div[contains(text(),'Ahmedabad')]")).click();
	     driver.findElement(By.xpath("//div[contains(text(),'Delhi')]")).click();
	     driver.findElement(By.xpath("//div[@data-testid='undefined-month-March-2022']/descendant::div[text()='15']")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//div[text()='Return Date']")).click();
	     driver.findElement(By.xpath("//div[@data-testid='undefined-month-April-2022']/descendant::div[text()='16']")).click();
	     driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
	     String Head = driver.findElement(By.xpath("//div[@style='font-family: inherit; padding-top: 25px;']")).getText();
	     System.out.println(Head);
	      String Roundtrip = driver.findElement(By.xpath("//span[text()='Ahmedabad']")).getText();
	     System.out.println(Roundtrip);
	     String DepDate = driver.findElement(By.xpath("//span[@style='padding-right: 10px;']")).getText();
	     System.out.println(DepDate);
	     String retDate = driver.findElement(By.xpath("//span[@style='margin-left: 2px; padding-right: 0px; width: 130px;']")).getText();
	     System.out.println(retDate);
	    String Passe = driver.findElement(By.xpath("//span[@style='margin-left: 0px; padding-right: 0px; width: 130px;']")).getText();
	    System.out.println(Passe);
	     driver.close();
	  
	     
	    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    /* if (Head.contains("kerala to DelhiDepart"))
	     {
			System.out.println("yes");
	     }
	     
			else
			{
				System.out.println("no");
			}
		 
	      if (Head.contains("Tue, 15 Mar 2022"))
	     {
	    	 System.out.println("Sat, 16 Apr 2022");
		 }
	      else
	      {
	    	  System.out.println("no");
	      }*/
	    
   
		
}
  	}
	
	


