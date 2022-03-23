package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLinkInNewTab {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
	WebElement wb = driver.findElement(By.linkText("Gmail"));
	Actions a=new Actions(driver);
	a.contextClick(wb).perform();
	a.sendKeys("")
	
	

	}

}
