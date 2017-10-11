//Conor Naylor 14316026
// Note more than one main method in package.

package assignment3;

import java.io.IOException;

public class CustomAccDetails{ //Copy of AccDetails that does not implement the serializable class

	private String name;
	private int accountNum;
	private double balance;
	
	public CustomAccDetails(String name, int accountNum, double balance){
		this.name = name;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
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

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Account Number: " + accountNum + ", Balance: $" + balance + "\n";
	}
}


