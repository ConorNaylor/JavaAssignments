//Conor Naylor 14316026
// Note more than one main method in package.

package assignment3;

import java.io.*;

public class CreateFile {

	private AccDetails[] a = new AccDetails[10];
	private AccDetails[] b = new AccDetails[10];
	
	public void makeAccounts(){									//This method makes an array of AccDetails objects.
		for(int i = 0; i < a.length; i++)
		{
			a[i] = new AccDetails("John", 1010+i, 1000.0*i);
		}
	}
	
	
	public void writeToFile() throws IOException{ 					//This method uses OOS to write to a file. Serializes objects 
		FileOutputStream FOS = new FileOutputStream("bankdetails.ser");
		ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		makeAccounts();
		for(int i = 0; i < a.length; i++)
			{
			OOS.writeObject(a[i]);
			}
		OOS.flush();
		OOS.close();
	}
	
	public void readFromFile() throws IOException, ClassNotFoundException{ // This method uses OIS to read form a file.
		FileInputStream FIS = new FileInputStream("bankdetails.ser");
		ObjectInputStream OIS = new ObjectInputStream(FIS);
		for(int i = 0; i < b.length; i++)
		{
			b[i] = (AccDetails)OIS.readObject();
		}		
		for(int j = 0; j < b.length; j++)
		{
			System.out.println(b[j]);
		}
	}

// 	Main class, to test the code.
	public static void main(String[] args) throws IOException{
		
		CreateFile cf = new CreateFile();	
		
		cf.makeAccounts();
		cf.writeToFile();
		try {
			cf.readFromFile();
		} catch (ClassNotFoundException e) {
			System.out.println("Error");
		}
			
	}
}

