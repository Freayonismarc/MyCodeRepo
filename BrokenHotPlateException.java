package hotpot.exceptions;

public class BrokenHotPlateException extends Exception
{
	public BrokenHotPlateException(String message)
	{
		super(message);
	}
	
	public BrokenHotPlateException()
	{
		super("Your Hot Plate is broken. " + 
		"Please call the waiter to assist you, before you starve to death.");
	}
}