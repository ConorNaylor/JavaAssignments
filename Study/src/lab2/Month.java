package lab2;

public class Month {

	private String name;
	
	public Month(int in2) {
		switch(in2){
		
		case 1: setMonth("January");
		break;
		case 2: setMonth("February");
		break;
		case 3: setMonth("March");
		break;
		case 4: setMonth("April");
		break;
		case 5: setMonth("May");
		break;
		case 6: setMonth("June");
		break;
		case 7: setMonth("July");
		break;
		case 8: setMonth("August");
		break;
		case 9: setMonth("September");
		break;
		case 10: setMonth("October");
		break;
		case 11: setMonth("November");
		break;
		case 12: setMonth("December");
		break;
		default: setMonth("Invalid Month");
			
		}
	}

	public void setMonth(String month){
		this.name = month;
	}
	public String getMonth(){
		return name;
	}
}
