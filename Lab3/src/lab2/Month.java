package lab2;

public class Month {
	
	private String monthString;

	public Month(int in2) {
		
	switch(in2){
	case 1: setMonthString("January");
	break;
	case 2: setMonthString("February");
	break;
	case 3: setMonthString("March");
	break;
	case 4: setMonthString("April");
	break;
	case 5: setMonthString("May");
	break;
	case 6: setMonthString("June");
	break;
	case 7: setMonthString("July");
	break;
	case 8: setMonthString("August");
	break;
	case 9: setMonthString("September");
	break;
	case 10: setMonthString("October");
	break;
	case 11: setMonthString("November");
	break;
	case 12: setMonthString("December");
	break;
	default: setMonthString("Invalid Month");
	}
	
	}

	public String getMonthString() {
		return monthString;
	}

	public void setMonthString(String monthString) {
		this.monthString = monthString;
	}

}
