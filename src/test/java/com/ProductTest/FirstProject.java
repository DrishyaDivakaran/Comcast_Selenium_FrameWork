package com.ProductTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstProject {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Products")).click();
		//driver.findElement(By.xpath("(//option[text()='Product Name'])[1]")).click();
		WebElement product=driver.findElement(By.xpath("(//select[@id='bas_searchfield'])[1]"));
		//WebElement product=driver.findElement(By.xpath("(//option[text()='Product Name'])[1]"));
		Select s=new Select(product);
		s.selectByValue("productname");
		System.out.println("sdssdsd");
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("Keyboard");
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		
		System.out.println("logouting process");
		//WebElement Logout=
		driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]")).click();
		//Select s1=new Select(Logout);
		//s1.selectByIndex(1).click();
		driver.findElement(By.linkText("Sign Out")).click();
		
		
		
		
		
		
	}

}
