//Conor Naylor 14316026
// Note more than one main method in package.

package assignment3;

import java.io.*;
import java.util.*;

public class CustomCreateFile { // This class writes and reads from a file, I used FileWriter and Scanner to perform this function.

	private CustomAccDetails[] a = new CustomAccDetails[5];
	private String[] b = new String[5];
	
	public void makeAccounts(){
		for(int i = 0; i < a.length; i++)
		{
			a[i] = new CustomAccDetails("John", 1010+i, 1000.0*i);
		}
	}
	
	
	public void writeToFile() throws IOException{			//Uses filewriter to write to file
		FileWriter  fw = new FileWriter("bankdetails.txt");
		for(int i = 0; i < a.length; i++)
			{
			fw.write(a[i] + "");
			}
		fw.flush();
		fw.close();
	}
	
	public void readFromFile() throws IOException, ClassNotFoundException{ //Uses scanner to read from file
		Scanner sc = new Scanner(System.in);
		File file = new File("bankdetails.txt");
		sc = new Scanner(file);
		for(int i = 0; i < b.length; i++)
		{
			if(sc.hasNext())
		{
				b[i] = sc.nextLine();
		}	
		}		
		for(int j = 0; j < b.length; j++)
		{
			System.out.println(b[j]);
		}
	}	//Main method to test classes
	public static void main(String[] args) throws IOException{ //Main method
		
		CustomCreateFile cf = new CustomCreateFile();	
		
		cf.makeAccounts();
		cf.writeToFile();
		try {
			cf.readFromFile();
		} catch (ClassNotFoundException e) {
			System.out.println("Error");
		}
			
	}
}

