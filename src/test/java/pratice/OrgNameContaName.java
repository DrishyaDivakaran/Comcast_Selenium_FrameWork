package pratice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrgNameContaName {
	
	@Test(dataProvider="dataProvider_bookTicketTest")
	public void orgNameConNameTest(String src,String dst)
	{
		System.out.println(" Orga name and contact name " + src + " to " + dst );
	}
	
	@DataProvider
	public Object[][] dataProvider_bookTicketTest()
	{
		/*Object[][]objArr=new Object[5][2];
		objArr[0][0]="Bangalore";
		objArr[0][1]="Goa";
		objArr[0][2]="USA";*/
		
		Object[][]objArr=new Object[4][2];
		objArr[0][0]="Bank1";
		objArr[0][1]="Ind1";
		
		
		
		objArr[1][0]="Bank2";
		objArr[1][1]="Ind1";
		
		
		
		objArr[2][0]="Bank3";
		objArr[2][1]="Ind1";
		
		
		
		objArr[3][0]="Bank4";
		objArr[3][1]="Ind1";
		
		
		
		
		return objArr;
		
		
	}

}                



