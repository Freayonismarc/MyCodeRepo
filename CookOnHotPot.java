package hotpot.cook;

import hotpot.exceptions.ColdPotException;
import hotpot.exceptions.BrokenHotPlateException;

public class CookOnHotPot
{
	public void hotPotCooking(String soupName, int temperature) 
	throws ColdPotException, BrokenHotPlateException
	{
		if(soupName.equals("Goulash"))
		{
			throw new ColdPotException();
		}
		else if(soupName.equals("Saute"))
		{
			throw new BrokenHotPlateException();
		}
		else
		{
			System.out.println("Thank you for dining with us" +
					", do not forget to pay before leaving." +
					"Please Come Again!");
		}
	}
}