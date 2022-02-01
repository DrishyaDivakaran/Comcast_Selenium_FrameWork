package com.crm.comcast.objectrepository;

import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;
public class EmailPg {
	
	

	WebDriver driver;
	
	public EmailPg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (linkText = "Email")
	private WebElement toEmail;
	
	 @FindAll({ @FindBy (xpath="(//input[@class='importBox'])[1]") , @FindBy (xpath="//input[@name='search_text']")})
	private WebElement searchBtn;
	 
	 
	 @FindBy (xpath="(//input[@name='find'])[1]")
	 private WebElement findBtn;

	public WebElement getToEmail() {
		return toEmail;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFindBtn() {
		return findBtn;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	

}
