package hotpot.temperature.check;

import hotpot.cook.CookOnHotPot;

import hotpot.exceptions.ColdPotException;
import hotpot.exceptions.BrokenHotPlateException;

import java.util.Scanner;

public class HotPotTemperature 
{

	public static void main(String[] args) 
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("What is the soup you ordered?: ");
			String nameOfTheSoup = scanner.nextLine();
			System.out.print("Enter the current temperature of your Hot Plate: ");
			int TemparatureOfTheHotPlate = scanner.nextInt();
			
			CookOnHotPot cohp = new CookOnHotPot();
			
			cohp.hotPotCooking(nameOfTheSoup, TemparatureOfTheHotPlate);
		}
		catch(ColdPotException cpe)
		{
			System.err.println(cpe.getMessage());
		}
		catch(BrokenHotPlateException bhpe)
		{
			System.err.println(bhpe.getMessage());
		}
	}

}
