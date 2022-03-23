package com.crm.comcast.contacttest;


import org.testng.annotations.Test;


import com.crm.comcast.objectrepository.Contacts;
import com.crm.comcast.objectrepository.Home;
import com.crm.comcast.objectrepository.Organizations;

import generic.BaseClass;

public class CreateContactWithOrgTest extends BaseClass {

	        	@Test
	        	public void endToEnd() throws Throwable
	        
	        {
	        	
	       //read data from excel
	 	String OrganiName=eLib.getDataFromExcel("org", 1,2)+jLib.getRandomNumber();
		//navigate to organization
		Home hp=new Home(driver);
		String hmPage=hp.getOrganizationalLink().getText();
		String pageHomeDisplayed=driver.getTitle();
		System.out.println(pageHomeDisplayed);
		
		
		 
		//Assert.assertEquals(pageHomeDisplayed,hmPage);
		
	
		if(pageHomeDisplayed.contains(hmPage))
		{
			System.out.println("home page navigated");
		}
		else
		{
			System.out.println("home page not navigated");
		} 
		
		//navigate to Organizational page
		hp.getOrganizationalLink().click();


		Organizations o=new Organizations(driver);
		wLib.waitUnitPageLoad(driver,5); 

		//check page displayed

		String pageOrgDisplayed=driver.getTitle();
		System.out.println(pageOrgDisplayed);
		String orgPage=o.getOrgText().getText();

		
		//Assert.assertEquals(pageOrgDisplayed,orgPage);
		
		
		
		if(pageOrgDisplayed.contains(orgPage))
		{
			System.out.println("organisaztion page displayed");
		}
		else
		{
			System.out.println("organization page not navigate");
		}   
		
		
		


		//Creating organization 
		String orgName= eLib.getDataFromExcel("org", 1, 2)+jLib.getRandomNumber();
		System.out.println(orgName);
		o.getCreatOrg().click();
		wLib.waitUnitPageLoad(driver,5); 
		o.createOrg(orgName);

		//Adding the industry 
		String indName=eLib.getDataFromExcel("org",4,3);
		wLib.drop(o.getIndSelect(),indName);
		//System.out.println("saved industry");
		System.out.println(indName);

		//Adding type industry type
		String typeName=eLib.getDataFromExcel("org",4,4);
		System.out.println(typeName);
		wLib.drop(o.getTypeSelect(),typeName);

		o.getSaveMe().click();

		//verify the organization created
		String createdOrg=o.getConfTest().getText();
		System.out.println(createdOrg);
		
		
		//Assert.assertEquals(createdOrg,orgName);
		
		
		if(createdOrg.contains(orgName))
		{
			System.out.println("succfully created ");
		}
		else
		{
			System.out.println("not created org");
		}   


		String createdInd=o.getInduText().getText();
		System.out.println(createdInd);
		
		
		
		
		//Assert.assertEquals(createdInd,indName);
		

		if(createdInd.contains(indName))
		{
			System.out.println("succsfully created org");

		}
		else
		{
			System.out.println("not created");
		} 


		String createdTyp=o.getTypeText().getText();
		System.out.println(createdTyp);
		
		
		
		//Assert.assertEquals(createdTyp,typeName);
		
		
		if(createdTyp.contains(typeName))
		{
			System.out.println("succfully crrated organization with industry");
		}
		else
		{
			System.out.println("not created the org with industry");
		}


		//navigate to contact page
		hp.getAdminLink().click();
		wLib.waitUnitPageLoad(driver,5); 
		hp.getContactLink().click();



		Contacts cp=new Contacts(driver);
		String contactVeri=cp.getContactBtn().getText();
		System.out.println(contactVeri);

		//verify contact pageDisplayed
		String pageContDisplayed=driver.getTitle();
		
		
		
		
		//Assert.assertEquals(pageContDisplayed,contactVeri);
		
	
		
		if(pageContDisplayed.contains(contactVeri))
		{
			System.out.println("contact page navigated");
		}
		else
		{
			System.out.println("contact page not navigated");
		}


		//create new contact
		String conName=eLib.getDataFromExcel("org", 4, 5)+jLib.getRandomNumber();
		cp.getContactBtn().click();
		cp.getEnterCont().sendKeys(conName);
		cp.getLinkOrg().click();

		String parentWn=driver.getTitle();
		wLib.switchToWindow(driver,cp.getWindPopUp());
		cp.getSearBox().sendKeys(orgName);
		cp.searchInWindowPopUp(orgName);
		cp.getSearchBtn().click();

		cp.orgSelect(orgName);

		wLib.switchToWindow(driver, parentWn);

		cp.getSaveBtn().click();

		//Verify the final Check if contact and org are inked and saved
		String headNameText = cp.getHeadNameText().getText();
		wLib.waitUnitPageLoad(driver, 5);
		String selectedOrgName = cp.getSelectedOrgName().getText();
		
		
		
		//Assert.assertEquals(pageContDisplayed,contactVeri);
		
		if((headNameText.contains(conName)) || (selectedOrgName.contains(orgName))) {
			System.out.println("Oranisation and Contact Conformation Sucessfully");
		}
		else {
			System.err.println("Oranisation and Contact Not Conformation Sucessfully");
		}
	}
	        	 
}
