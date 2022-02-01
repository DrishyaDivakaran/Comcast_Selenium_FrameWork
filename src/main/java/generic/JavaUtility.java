package generic;


import java.util.Date;
import java.util.Random;


/**
 * this class contains java specific library
 * @author drishya
 *
 */

public class JavaUtility {
	
	/**
	 * this method will generate a random number and returns a number returns a 
	 * @return
	 */
	public int getRandomNumber()
	{
		Random ranDom=new Random();
		int ranDomNum=ranDom.nextInt(1000);
		return ranDomNum;	
	}
	
	
	/**
	 * this method will return the current date
	 * @return
	 */
	public String getCurrentDate()
	{
		Date date=new Date();
		String systemDateAndTime=date.toString();
		return systemDateAndTime;
	}
	
	
	/**
	 * this method will return current system date with YYYY-MM-DD
	 * @return
	 */
	public String getSystemDate_YYYY_MM_DD() {
		
		Date date=new Date();
		String systemDateAndTime=date.toString();
		System.out.println(systemDateAndTime);
		String [] arr=systemDateAndTime.split(" ");
		String YYYY=arr[5];
		String DD=arr[2];
		String  MM=arr[1];
		String finalFormate=YYYY+"_"+MM+" _"+DD;
		return finalFormate;
	}

}
