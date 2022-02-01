package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	public  Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(linkText="Organizations")
	private WebElement organizationalLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	
	@FindBy (xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminLink;
	
	@FindBy (linkText="Sign Out")
	private WebElement signOut;
	
	
	@FindBy (linkText="Email")
	private WebElement emailLink;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getOrganizationalLink() {
		return organizationalLink;
	}



	public WebElement getContactLink() {
		return contactLink;
	}



	public WebElement getAdminLink() {
		return adminLink;
	}


	public WebElement getSignOut() {
		return signOut;
	}


	public WebElement getEmailLink() {
		return emailLink;
	}



	public  void close()
	{
		Actions act=new Actions(driver);
		act.moveToElement(adminLink).perform();
		signOut.click();
	}
	
	

}
