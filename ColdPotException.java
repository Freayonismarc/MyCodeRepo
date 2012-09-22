package hotpot.exceptions;

public class ColdPotException extends Exception
{
	public ColdPotException(String message)
	{
		super(message);
	}
	
	public ColdPotException()
	{
		super("You Forgot to turn on the hotplate for your HotPot. " + 
		"Please press the on button, or call the waiter to do it for you");
	}
}