//14316026
// Abstract base class Employee.

import java.io.*;
import java.util.Date;


public abstract class Employee {

    private String firstName;
    private String lastName;
    private static int idNumber = 0;
    private Date joinDate;
    private Date invalidDate = new Date(1990,0,1);
    
    // constructor
    public Employee(String first, String last, Date jDate) throws invalidDateException{
    	firstName = first;
        lastName = last;
        joinDate = jDate;
        if(jDate.before(invalidDate)){
        	throw new invalidDateException(last, first, jDate);
        }
        if(jDate.after(new Date())){
        	throw new invalidDateException(last, first, jDate);
       }
    }
    
    //the previous lines of code check for invalid inputs and pass the exceptions to the invalidDateException class

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }
    
    // get ID number
    public int getIdNum() {
		return idNumber();
    }
    
    public Date getJoinDate(){
    	return joinDate;
    }

    public String toString() {
        return firstName + ' ' + lastName + ' ' + idNumber + joinDate;
    }
    
    public static int idNumber(){
    	idNumber++;
    	return idNumber;
    }

    public abstract double earnings();
}
