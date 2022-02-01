package com.crm.comcast.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class Contacts {
	WebDriver localdriver;
	public  Contacts(WebDriver driver) {
		this.localdriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
   // click on contact
	@FindAll({@FindBy(linkText = "Contacts"),@FindBy(className = "hdrLink")})
	private WebElement contactLink;

	
	
	//click on create contact button
	@FindBy(xpath ="//img[@alt='Create Contact...']")
	private WebElement contactBtn;
	
	
	

	//enter the contact last name
	@FindAll({@FindBy(name ="lastname"),@FindBy(xpath="//input[@class='detailedViewTextBox']")})
	private WebElement enterCont;
	
	
	

	//linking organization
	@FindBy (xpath="//img[@src='themes/softed/images/select.gif']/../../td[2]/img")
	private WebElement linkOrg;
	
	
	//to save
	@FindBy(xpath ="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	//PopUp window WE
	@FindBy(xpath ="//input[@class='txtBox']")
	private WebElement searBox;
	
	
	@FindBy(xpath="//select[@name='search_field']")
	private WebElement searchBox ;
	
	//search 
	@FindBy(xpath ="//input[@name='search']")
	private WebElement searchBtn;
	

	//PopUpWindow Text                                      
	private String windPopUp="Accounts&action";	
	String filterText="Organization Name";
	
	
	
	//PopUP In WebElement                                     
	@FindBy(xpath ="//option[@label='Website']")
	private WebElement nameToSearch;
	
	
	public void searchInWindowPopUp(String orgName)
	{
		getSearchBox().click();
	}
	
	
	public void orgSelect(String orgName)
	{
	String searchOrg=localdriver.findElement(By.xpath("//a[.='"+orgName+"']")).getText();
	
	
	if(searchOrg.contains(orgName))
	{
		localdriver.findElement(By.xpath("//a[.='"+orgName+"']")).click();
		System.out.println("msg from conPom :org is linked to contact");
	}
	else
	{
		System.out.println("not");
	}
	}
	
	
	
	//verification process
	@FindBy(className="dvHeaderText")
	private WebElement headNameText;
	
	//organization selected Text
	//@FindBy (id="mouseArea_Organizaction Name")
	@FindAll({@FindBy(className ="dvtCellInfo"),@FindBy(id="mouseArea_Organizaction Name")})
	private WebElement selectedOrgName;
	
	public WebDriver getLocaldriver() {
		return localdriver;
	}


	public WebElement getContactLink() {
		return contactLink;
	}


	public WebElement getContactBtn() {
		return contactBtn;
	}


	public WebElement getEnterCont() {
		return enterCont;
	}


	public WebElement getLinkOrg() {
		return linkOrg;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}


	public WebElement getSearBox() {
		return searBox;
	}


	public WebElement getSearchBox() {
		return searchBox;
	}


	public WebElement getSearchBtn() {
		return searchBtn;
	}


	public String getWindPopUp() {
		return windPopUp;
	}


	public String getFilterText() {
		return filterText;
	}


	public WebElement getNameToSearch() {
		return nameToSearch;
	}


	public WebElement getHeadNameText() {
		return headNameText;
	}


	public WebElement getSelectedOrgName() {
		return selectedOrgName;
	}
	
	
	
	
	

}
