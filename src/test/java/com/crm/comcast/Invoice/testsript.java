package com.crm.comcast.Invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testsript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//img[@style='padding-left:5px']")).click();
        driver.findElement(By.xpath("//a[@name='Invoice']")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        driver.findElement(By.xpath("(//input[@class='crmbutton small delete'])[1]")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("(//img[@src='themes/softed/images/user.PNG'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).click();
       // driver.close();
	}

}
