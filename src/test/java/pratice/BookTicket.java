package pratice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTicket {
	
	@Test(dataProvider="dataProvider_bookTicketTest")
	public void bookTicketTest(String src,String dst)
	{
		System.out.println("Book ticket From"+src+"to"+dst);
	}
	
	@DataProvider
	public Object[][] dataProvider_bookTicketTest()
	{
		/*Object[][]objArr=new Object[5][2];
		objArr[0][0]="Bangalore";
		objArr[0][1]="Goa";
		objArr[0][2]="USA";*/
		
		Object[][]objArr=new Object[5][3];
		objArr[0][0]="Bangalore";
		objArr[0][1]="Goa";
		objArr[0][2]=10;
		
		
		objArr[1][0]="Bangalore";
		objArr[1][1]="Mangalore";
		objArr[1][2]=10;
		
		
		objArr[2][0]="Bangalore";
		objArr[2][1]="Kerala";
		objArr[2][2]=10;
		
		
		objArr[3][0]="Bangalore";
		objArr[3][1]="Mumbai";
		objArr[3][2]=10;
		
		objArr[4][0]="Bangalore";
		objArr[4][1]="Kannur";
		objArr[4][2]=10;
		return objArr;
		
		
	}

}                



