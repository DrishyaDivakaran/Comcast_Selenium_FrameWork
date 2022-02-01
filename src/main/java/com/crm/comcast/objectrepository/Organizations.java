package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class Organizations {
	
	WebDriver driver;
	
	public Organizations(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindAll ({@FindBy (linkText = "Organizations"),@FindBy(className = "hdrLink")})
	private WebElement orgText;

	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement creatOrg;
	
	
	@FindAll({@FindBy(xpath = "//input[@class='detailedViewTextBox']"),@FindBy(name ="accountname")})
	private WebElement nameOrg;
	
	
	@FindBy(name = "industry")
	private WebElement indSelect;
	
	
	@FindBy(name = "accounttype")
	private WebElement typeSelect;
	
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveMe;
	
	
	@FindBy(xpath="(//span[@class='dvHeaderText'])[1]")
	private WebElement confTest;
	
	//verify industry
	@FindBy(id = "dtlview_Industry")
	private WebElement induText;
	
	
	//verify type
	@FindBy(id = "dtlview_Type")
	private WebElement typeText;

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getOrgText() {
		return orgText;
	}


	public WebElement getCreatOrg() {
		return creatOrg;
	}


	public WebElement getNameOrg() {
		return nameOrg;
	}


	public WebElement getIndSelect() {
		return indSelect;
	}


	public WebElement getTypeSelect() {
		return typeSelect;
	}


	public WebElement getSaveMe() {
		return saveMe;
	}


	public WebElement getConfTest() {
		return confTest;
	}


	public WebElement getInduText() {
		return induText;
	}


	public WebElement getTypeText() {
		return typeText;
	}
	
	
	public void createOrg(String orgName) {
		getNameOrg().sendKeys(orgName);
	}
	
	
	

	
	

}
