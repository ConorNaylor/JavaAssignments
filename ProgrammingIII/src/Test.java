//14316026
// Driver for Employee hierarchy

// Java core packages
import java.text.DecimalFormat;
import java.util.Date;

// Java extension packages
import javax.swing.JOptionPane;

public class Test {

    // test Employee hierarchy
	
   public static void main(String args[]) throws invalidDateException {
        Employee employee; // superclass reference
        String output = "";
        
        Employee[] EmployeeArray;
        EmployeeArray = new Employee[4]; // array of employees
        
        Date bossDate = new Date(1989,4,15);
        Date CWDate = new Date(1999,5,1);
        Date PWDate = new Date(2006,8,7);
        Date HWDate = new Date(2018,2,8);
        
//        try{
		Boss boss = new Boss
				("John", "Smith", bossDate, 800.0);
        EmployeeArray[0] = boss;
//       }
//        catch(invalidDateException except){
//        	System.out.println("Error with inputted data");
//        }
        
//        try{
        CommissionWorker commissionWorker = new CommissionWorker(
                "Sue", "Jones", CWDate, 400.0, 3.0, 150);
        EmployeeArray[1] = commissionWorker;
//        }
//        catch(invalidDateException except){
//    	System.out.println("Error with inputted data");
//        }
        
//        try{
        PieceWorker pieceWorker = new PieceWorker
        		("Bob", "Lewis", PWDate, 2.5, 200);
        EmployeeArray[2] = pieceWorker;
//		}
//		catch(invalidDateException except){
//		System.out.println("Error with inputted data");
//		}
        
//       try{
        HourlyWorker hourlyWorker = new HourlyWorker
        		("Karen", "Price", HWDate, 13.75, 40);
        EmployeeArray[3] = hourlyWorker;
//        }
//        catch(invalidDateException except){
//    	System.out.println("Error with inputted data");
//        }
        

        DecimalFormat precision2 = new DecimalFormat("0.00");
        

	        for(int i = 0; i < EmployeeArray.length; i++){
	        	if((EmployeeArray[i].getJoinDate().getDay() - new Date().getDay()) > (365*5) ){
	        		System.out.println(EmployeeArray[i].earnings() + 100);
	        	}
	        	else System.out.println(EmployeeArray[i].getFirstName() + ": " + EmployeeArray[i].earnings());
	        }   
	        //I attempted to calculate whether the or not the employee deserved a bonus here but I did not have enough time to perfect and test. 
 
 //Employee reference to a Boss
        employee = boss;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + boss.toString() + " earned $"
                + precision2.format(boss.earnings()) + "\n";

        // Employee reference to a CommissionWorker
        employee = commissionWorker;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + commissionWorker.toString() + " earned $"
                + precision2.format(
                commissionWorker.earnings()) + "\n";

        // Employee reference to a PieceWorker
        employee = pieceWorker;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + pieceWorker.toString() + " earned $"
                + precision2.format(pieceWorker.earnings()) + "\n";

// Employee reference to an HourlyWorker
        employee = hourlyWorker;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + hourlyWorker.toString() + " earned $"
                + precision2.format(hourlyWorker.earnings()) + "\n";

        JOptionPane.showMessageDialog(null, output,
                "Demonstrating Polymorphism",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
} // end class Test
