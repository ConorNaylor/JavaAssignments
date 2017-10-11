//Conor Naylor 14316026
// Note more than one main method in package.

package assignment3;

import java.io.IOException;

public class AccDetails implements java.io.Serializable{ // This class defines the AccDetails objects, it implements the serializing class in java.io

	private String name;
	private int accountNum;
	private double balance;
	
	public AccDetails(String name, int accountNum, double balance){ // Basic constructor
		this.name = name;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	// Following code are accessor methods, not used in this assignment.
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	//The following is a String representation of the class AccDetails
	
	@Override
	public String toString() {
		return "Name: " + name + ", Account Number: " + accountNum + ", Balance: $" + balance + ".";
	}
}


