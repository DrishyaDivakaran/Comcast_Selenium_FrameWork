package com.crm.Api;

import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import com.crm.POJO.dri;

import GenUtilityAPI.BaseApiClass;
import generic.JavaUtility;

public class TC extends BaseApiClass {
	@Test
	public void create()
	{
		
		int ranNum = jUtil.getRandomNumber();
		String expePrjName="Myntraa"+random1;
		Pojo pobj=new Pojo("drishya",expePrjName,"completed", 100");
		Response response=
				
		
		
	}

}
