package GenUtilityAPI;

import java.util.Random;

public class JavaUtility {
	/*public void random()
	{
		int ran = new Random().nextInt(1000);
		
	}*/

	public int getRandomNumber()
	{
		Random ran=new Random();
		int random1 = ran.nextInt(1000);
		return random1;
		
	}
	

}
