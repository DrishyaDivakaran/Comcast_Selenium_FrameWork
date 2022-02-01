  package generic;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebdriverUtility {
	/**
	 * this method is for waiting 20 seconds
	 * @param driver
	 */ 
	public void waitUnitPageLoad(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	   /**
	    * This method wait for the element to be visible
	    * @param driver
	    * @param i
	    * 
	    */
	   public void waitForElementVisibility(WebDriver driver,WebElement i)
	   {
		  WebDriverWait wait =new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOf(i));
	   }
	      
	   
	   
	   /**
	    * This method wait for the element to be clicked , its custom wait created to avoid elemenInterAceptable Exception
	    * @param element
	    * @throws throwable
	    * 
	    */
	   public void waitAndClick(WebElement element) throws InterruptedException
	   {
		   int count = 0;
	       while(count<20) {
		    	   try {
		    	       element.click();
		    	       break;
		    	       } 
		    	       catch(Throwable e){
		    		   Thread.sleep(1000);
		    		   count++;
		    	   }
	       }
	       
	   }
	   
	   

	   
	   /**
	    * this methods enables user to handle dropdown using visible text
	    * @param element
	    * @param option
	    */
	   public void drop(WebElement element, String option)
	   {
		   Select s=new Select(element);
		   s.selectByVisibleText(option);   
	   }
	   
	   
	   
	   public void drop(String value ,WebElement element)
	   {
		   Select s=new Select(element);
		   s.selectByValue(value);
		   
	   }   
	   	   
	   
	   /**
	    * this methods enables user to handle dropdown using index
	    * @param element
	    * @param index
	    */    
	   public void drop(WebElement element, int index)
	   {
		   Select s=new Select(element);
		   s.selectByIndex(index);   
	   }


	   
	   
	   
	   
	   
	   /**
	    * This method will perform mouse over action
	    * @param driver
	    * @param element
	    */
	   public void mouseOver(WebDriver driver,WebElement element)
	   {
		   Actions act = new Actions(driver);
		   act.moveToElement(element).perform();
		   
	   }
	   
	   
	   
	   
	   

	   /**
	    * This method performs right click operation 
	    * @param driver
	    * @param element
	    */
	   public void rightClick(WebDriver driver,WebElement element)
	   {
		   Actions act = new Actions(driver);
		   act.contextClick(element).perform();
	   }

	   
	   
	   
	   

	   /**
	    * This method helps to switch from one window to another
	    * @param driver
	    * @param partialWinTitle
	    */
	   public void switchToWindow(WebDriver driver, String partialWinTitle)
	   {
		   Set<String> window = driver.getWindowHandles();
		   Iterator<String> it = window.iterator();
		   while(it.hasNext())
		   {
			   String winId=it.next();
			   String title=driver.switchTo().window(winId).getTitle();
	           if(title.contains(partialWinTitle))
	           {
	        	   break;
	           }
		   }
	   }
	   
	   
	   
	   
	   
	   
	   
	   /**
	    * Accept alert 
	    * @param driver
	    */
	   public void acceptAlert(WebDriver driver)
	   {
		   driver.switchTo().alert().accept();
	   }
	   
	   

	   
	   /**
	    * Cancel Alert
	    * @param driver
	    */
	   public void cancelAlert(WebDriver driver)
	   {
		   driver.switchTo().alert().dismiss();
	   }
	   
	   
	   
	   
	   /**
	    * This method used for scrolling action in a webpage
	    * @param driver
	    * @param element
	    */
	   public void scrollToWebElement(WebDriver driver, WebElement element) {
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		  int y= element.getLocation().getY();
		   js.executeScript("window.scrollBy(0,"+y+")", element);
	   }
	   
	   
	    public void switchFrame(WebDriver driver,int index) {
	    	driver.switchTo().frame(index);
	    }   
	    
	    public void switchFrame(WebDriver driver,WebElement element) {
	    	driver.switchTo().frame(element);
	    } 
		
	    public void switchFrame(WebDriver driver,String idOrName) {
	    	driver.switchTo().frame(idOrName);
	    } 

	    public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
	    	TakesScreenshot ts=(TakesScreenshot)driver;
	    	File src=ts.getScreenshotAs(OutputType.FILE);
	    	File dest=new File("./screenshot/"+screenshotName+".PNG");
	    	Files.copy(src, dest);
	    }
	    
	    
	    
	    
	    
	    
	    /**
	     * pass enter Key appertain in to Browser
	     * @param driver
	     */
	    public void passEnterKey(WebDriver driver) {
	 	   Actions act = new Actions(driver);
	 	   act.sendKeys(Keys.ENTER).perform();
	    } 
	 }

	    



	   

	   
	  




		
	