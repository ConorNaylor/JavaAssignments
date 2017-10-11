package lab2;


public class Day {
	private int day;
	private int month;
	private String name; //e.g. Tuesday
	private int no_days;
	private int day_number;
		
	public Day(int dy, int mth ){
		day = dy;
		month = mth;
		Calculate_day(day, month);
		
	}
	
	private void Calculate_day(int day, int month) {
		if (month > 1) {
			no_days = ((month -1) * 30) + day;
		}
		else {
			no_days = day;
		}
		day_number = ((no_days - 1) % 7);
		
		switch(day_number){
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
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public int getDay() {
		return day;
	}

}
