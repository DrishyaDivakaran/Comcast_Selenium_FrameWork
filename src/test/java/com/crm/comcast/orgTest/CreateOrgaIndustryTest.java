package com.crm.comcast.orgTest;

import org.testng.annotations.Test;

import com.crm.comcast.objectrepository.Home;
import com.crm.comcast.objectrepository.Organizations;

import generic.BaseClass;

public class CreateOrgaIndustryTest extends BaseClass {

	     @Test
	     public void orgCreate() throws Throwable
	     {
	    	 
		
		
		//navigate to organization
		Home hp=new Home(driver);
		hp.getOrganizationalLink().click();


		//navigate to create organization page
		Organizations o=new Organizations(driver);
		o.getCreatOrg().click();

		wLib.waitUnitPageLoad(driver,5);     

		//checkPage displayed load
		String pageOrgDisplayed=driver.getTitle();
		System.out.println(pageOrgDisplayed);

		String orgPage =o.getOrgText().getText();

		if(pageOrgDisplayed.contains(orgPage)) {
			System.out.println("Organization Page Navigated");
		}
		else {
			System.out.println("Organization Page Not Navigated");
		}
		String orgName= eLib.getDataFromExcel("org", 1, 1)+jLib.getRandomNumber();
		o.getNameOrg().sendKeys(orgName);
		System.out.println("saved the org");

		String selectindus=eLib.getDataFromExcel("org",4,3);
		wLib.drop(o.getIndSelect(),selectindus);
		System.out.println("saved industry");
		
		o.getSaveMe().click();	
	}
}
