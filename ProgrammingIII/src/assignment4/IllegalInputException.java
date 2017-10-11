package assignment4;

//Conor Naylor 14316026

public class IllegalInputException extends Exception //This exception is thrown if the input is out of bounds.
{
public IllegalInputException(String reason)
{
	super(reason);
}
}
