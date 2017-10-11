//14316026
import java.util.Date;

public class invalidDateException extends Exception {

public invalidDateException(String first, String last, Date date){
	super("Invalid Date Exception for Employee: " + last + " " + first + " Mistaken date: " + date + " " + "Please enter a valid date");
}
}

