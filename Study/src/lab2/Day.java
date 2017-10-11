package lab2;

// This is a special method called a Constructor. 
//It is called when you create new Object - in this case, of type Day

public class Day {
	private int day;
	private int month;
	private String name; //e.g. Tuesday
	private int noDay;
	private int dayNumber;
	
	public Day(int dy, int mth){
		day = dy;
		month = mth;
		calculateDay(day, month);
		//TODO
		//insert code to initialise the value of the name variable to a valid
		// day name (.e.g. Tuesday
		// you will need to use the the int value of day and month to calculate this 
	}
	
	private void calculateDay(int day, int month){
	if(month > 1){
		noDay = (month-1)*30;
	}
	else {
		noDay = day;
	}
	dayNumber = (noDay-1) % 7;	
	switch(dayNumber){
	case 0: setName("Monday");
	break;
	case 1: setName("Tuesday");
	break;
	case 2: setName("Wednesday");
	break;
	case 3: setName("Thursday");
	break;
	case 4: setName("Friday");
	break;
	case 5: setName("Saturday");
	break;
	case 6: setName("Sunday");
	break;
	default: setName("Invalid Day");
	break;
	}
	}
	
	public void setName(String nm){
		this.name = nm;
	}
	
	public String getName(){
		return name;
	}
	
	public int getDay(){
	return day;
	}
}
