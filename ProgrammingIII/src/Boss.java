//14316026
// Boss class derived from Employee.
import java.util.Date;

public final class Boss extends Employee {

    private double weeklySalary;
//    private Date date;

    // constructor for class Boss
    public Boss(String first, String last, Date jDate, double salary) throws invalidDateException { //had to add the extra variables to the constructor
        super(first, last, jDate); // call superclass constructor
        setWeeklySalary(salary);
//        setDate(jDate);
    }

//    public setDate(Date date){
//    	date = date;
//    }
    
    // set Boss's salary
    public void setWeeklySalary(double salary) {
        weeklySalary = (salary > 0 ? salary : 0);
    }

    // get Boss's pay
    public double earnings() {
        return weeklySalary;
    }

    // get String representation of Boss's name
    public String toString() {
        return "Boss: " + super.toString();
    }
} // end class Boss
