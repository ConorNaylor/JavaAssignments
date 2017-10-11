package assignment2;


//Conor Naylor 14316026
//import java.util.Enumeration;

public enum Months { 
	JANUARY (1,31, "st"), 
	FEBRUARY (2,28, "nd"),
	MARCH (3, 31, "rd"),
	APRIL (4, 30, "th"),
	MAY (5, 31, "th"),
	JUNE (6, 30, "th"),
	JULY (7, 31, "th"), 
	AUGUST (8, 31, "th"), 
	SEPTEMBER (9, 30, "th"), 
	OCTOBER (10, 31, "th"),
	NOVEMBER (11, 30, "th"), 
	DECEMBER (12, 31, "th"); //defines all the months enums and the variables held by each: 1) position in year 2) number of days 3)prefix 

	private final int monthNo;
	private final int noDays;
	private final String prefix;
	
	Months(int monthNo, int day, String prefix){
	this.noDays = day;
	this.monthNo = monthNo;
	this.prefix = prefix;
	}
	
	public int getDays(){
		return noDays;
	}
	
	public int monthNo(){
		return monthNo;
	}
	
	public String getPrefix(){
		return prefix;
	}
	
	static int totalDays(){
		int total = 0;
		for(Months m : Months.values()){
			total += m.getDays();
		}
		return total;
	}						//iterates through the emuns and calculates the number of days in the year by adding the days in each month.
	
	public String toString(){
	return "There are " + getDays() + " days in the month of " + this.name() + " which is the " + monthNo() + getPrefix() + " of the year.";	
	} 						//toString method returns string represenation of the enums
}







