package assignment4;

//Conor Naylor 14316026

import java.util.*;

public class RationalOrder implements Comparator<Rational> //This class compares the two rational numbers
{

	@Override
	public int compare(Rational r1, Rational r2) 		   //This method checks the rational numbers by comparing the num and denoms multiplied by eachother
	{
		int lhs = r1.getNumerator() * r2.getDenominator();
		int rhs = r2.getNumerator() * r1.getDenominator();
		if(lhs < rhs) return - 1;
		if(rhs < lhs) return 1;
		return 0;
	}

}

