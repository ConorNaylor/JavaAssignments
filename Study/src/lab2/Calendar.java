package lab2;

public class Calendar {

	//assume all months have 30 days and that 1 January is a Monday;
	
	public static void main(String[] args) { // e.g. input: 29 09 2015
		
		int in1 = Integer.parseInt(args[0]);
		int in2 = Integer.parseInt(args[1]);
		int in3 = Integer.parseInt(args[2]);
	
		Day day = new Day(in1, in2); 
		Month month = new Month(in2); 
		Year year = new Year(in3);
		
		Date date = new Date(day, month, year);
	
		date.printName(); // e.g. "The date is Tuesday, 29th of September, 2015

	}
}
