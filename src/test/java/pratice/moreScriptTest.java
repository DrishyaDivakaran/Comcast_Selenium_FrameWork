package pratice;

import org.testng.annotations.Test;

import com.crm.comcast.objectrepository.Home;
import com.crm.comcast.objectrepository.More;

import generic.BaseClass;
import generic.ExcelUtility;
import generic.FileUtility;
import generic.JavaUtility;
import generic.WebdriverUtility;

public class moreScriptTest extends BaseClass{

	@Test
		
		
		public void more() throws Throwable
		{
			Home hp=new Home(driver);
			hp.getMoreBtn().click();
			
			More mo=new More(driver);
			mo.getInvoiceBtn().click();
			
			wLib.waitUnitPageLoad(driver,5);  
			mo.getCreateInvoice().click();
			
			String SubjName=eLib.getDataFromExcel("org", 10, 1)+jLib.getRandomNumber();
			mo.getSubName().sendKeys(SubjName);
			
			String billAdd=eLib.getDataFromExcel("org", 10, 2);
			mo.getBillAddres().sendKeys(billAdd);
			
			String ShippAddr=eLib.getDataFromExcel("org", 10, 3);
			mo.getShipAdress().sendKeys(ShippAddr);
			mo.getSavBtn().click();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	

	
		
	}


