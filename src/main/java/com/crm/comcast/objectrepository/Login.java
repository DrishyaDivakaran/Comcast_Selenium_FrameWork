    package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//creating separate class for all page in application
    public class Login {
	          WebDriver driver;
	
	//execute all elements & initialize  the elements in pageFactory.initElement[intialization]
	public Login(WebDriver driver) 
		
		{
		   this.driver=driver;
		
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (name="user_name")
		private WebElement userName;
		
		@FindBy (name="user_password")
		private WebElement passWord;
		
		@FindBy(id="submitButton")
		private WebElement loginBtn;
		
		
	



		public void loginApp(String propertyKeyValue, String propertyKeyValue2) {
			
			userName.sendKeys(propertyKeyValue);
			passWord.sendKeys(propertyKeyValue2);
			loginBtn.click();
			
		}
}
