package assignment4;

//Conor Naylor 14316026

public class Rational
{	
	private int numerator, denominator;
	
	public Rational(int numer, int denom) throws IllegalInputException
	{
		if(denom == 0)				//Denominator cannot be zero, dividing by 1 will not change answer.
		{
			denom = 1;
		}
		
		if(denom < 0)				//If a negative number is in the denominator, it will be transferred to numerator
		{			
			numer = numer * -1;
			denom = denom * -1;
		}
		
		int c = commonD(numer, denom); // Checks for a common divisor
		numerator = numer   / c;
        denominator = denom / c;
	}
	
	public int getNumerator()
	{
		return numerator;
	}

	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}

	private static int commonD(int numer, int denom) //Recursive function to check if there is a common divisor 
	{
		if(denom == 0){
			return numer;
		}
		else return commonD(denom, numer % denom);
	}

	public double toDouble()						//Returns the rational number in double format
	{
		return (double)numerator/denominator;
	}

	public String toString()						//Returns a string representation of the rational number
	{
		return getNumerator() + "/" + getDenominator();
	}

}

