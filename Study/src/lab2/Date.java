package lab2;

public class Date {
	
	private Day day;
	private Month month;
	private Year year;

	public Date(Day day, Month month, Year year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void printName() {
		System.out.println(day.getDay() + month.getMonth() + year.getYear());
		
	}

}
