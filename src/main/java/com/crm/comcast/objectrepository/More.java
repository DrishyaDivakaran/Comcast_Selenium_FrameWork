package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class More {
	
	WebDriver driver;
	
	public More(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText ="Invoice")
	private WebElement invoiceBtn;
	
	@FindBy (xpath="//img[@alt='Create Invoice...']")
	private WebElement createInvoice;
	
	@FindBy (xpath="(//input[@type='text'])[1]")
	private WebElement subName;
	
	
	@FindBy (name="bill_street")
	private WebElement BillAddres;
	
	@FindBy (name="ship_street")
	private WebElement ShipAdress;
	
	@FindBy (name="button")
	private WebElement savBtn;
	
	
	
	
	
	
	
	
	
	



	public WebElement getSavBtn() {
		return savBtn;
	}



	public WebElement getShipAdress() {
		return ShipAdress;
	}



	public WebElement getSubName() {
		return subName;
	}



	public WebElement getBillAddres() {
		return BillAddres;
	}



	public WebDriver getDriver() {
		return driver;
	}

	

	public WebElement getInvoiceBtn() {
		return invoiceBtn;
	}

	

	public WebElement getCreateInvoice() {
		return createInvoice;
	}

	
	
	
	
	
			

}
