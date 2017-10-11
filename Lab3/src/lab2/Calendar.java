package lab2;

public class Calendar {
	
	public static void main(String[] args) { 
		
		int in1 = Integer.parseInt(args[0]);
		int in2 = Integer.parseInt(args[1]);
		int in3 = Integer.parseInt(args[2]);
	
		if(in1<30 && in2<30 ){
		Day day = new Day(in1, in2);
		Month month = new Month(in2); 
		Year year = new Year(in3);
		}
		Date date = new Date(day, month, year);
	
		date.printName();

	}
}
