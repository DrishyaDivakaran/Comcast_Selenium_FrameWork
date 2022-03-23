package pratice;

import generic.JavaUtility;

public class CurrentDate   {

	public static void main(String[] args) {
		JavaUtility h=new JavaUtility();
		
		String name = h.getCurrentDate();
		System.out.println(name);
		String date=h. getSystemDate_YYYY_MM_DD();
		System.out.println(date);
	}

}
