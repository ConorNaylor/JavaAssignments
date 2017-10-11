//Conor Naylor 14316026

package assignment2;

public class TestClass {

	
public static void main(String[] args){ 	// main class for testing enum class
	
	int leapyear = Months.totalDays() + 1;  //defines leapyear as the total in a regular year plus one
	
	for(Months m : Months.values()){		//iterates through the months, printing the toString method as it goes.
		System.out.println(m);
	}
	int total = Months.totalDays();
	
	System.out.println("\nThe total days in a regular year is " + total); //prints the total days in a year
	System.out.println("The total days in a leap year is " + leapyear);	  //prints the total days in a leap year
	System.out.println();
	
	for(Months m : Months.values()){
		if(m.getDays() == 31){
			System.out.println(m.name() + " has 31 days.");	//prints the months with the number of days as 31
			}
		}
	
	System.out.println();
	
	for(Months m : Months.values()){
		if(m.getDays() == 30){
			System.out.println(m.name() + " has 30 days.");	//prints the months with the number of days as 31
			}
		}
	
	System.out.println();
	
	for(Months m : Months.values()){
		if(m.getDays() == 28){
			System.out.println(m.name() + " has 28 days.");	//prints the months with the number of days as 31
			}
		}
	}
}