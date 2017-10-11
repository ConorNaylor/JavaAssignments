package lab2;

public class Date {
	Day day; 
	Month month; 
	Year year;

	public Date(Day day, Month month, Year year) {
		this.day = day; 
		this.month = month; 
		this.year = year;
	}
	
	public void printName() {
		System.out.println("The date is " + day.getName() + ", " + day.getDay() + "th of " + month.getMonthString() + ", " + year.getYear()+".");
		
	}

}
