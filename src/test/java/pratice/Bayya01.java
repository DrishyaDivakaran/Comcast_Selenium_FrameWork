package pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Bayya01 {
	@Test
	public void First()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Products")).click();
		WebElement product=driver.findElement(By.xpath("(//select[@id='bas_searchfield'])[1]"));
		Select s=new Select(product);
		s.selectByValue("productname");
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("Nokia");
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		System.out.println("editiong started");
		driver.findElement(By.xpath("(//input[@title='Edit [Alt+E]'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys("Keyboard");
		driver.findElement(By.xpath("//input[@name='product_no']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='productcode']")).sendKeys("12");
		WebElement manifacture=driver.findElement(By.xpath("//select[@name='manufacturer']"));
		Select s1=new Select(manifacture);
		s1.selectByValue("LexPon Inc.");
		WebElement category= driver.findElement(By.xpath("//select[@name='productcategory']"));
		Select s2=new Select(category);
		s2.selectByValue("Hardware");
		driver.findElement(By.xpath("//input[@name='start_date']")).sendKeys("2018-05-09");
		driver.findElement(By.xpath("//input[@name='vendor_part_no']")).sendKeys("12");
		driver.findElement(By.xpath("(//select[@class='small'])[1]")).sendKeys("2018-05-23");
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		
		
		
		
		

		
	}

}
