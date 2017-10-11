//Conor Naylor 14316026
// Note more than one main method in package.

package assignment3;

import java.io.*;

public class RandomAccess{ 
	
	public static void append(String filename, String text) throws Exception{
	
	File file = new File(filename);
	long pos = file.length();
	RandomAccessFile raf = new RandomAccessFile(filename, "rw"); //declares randomacccessfile
	raf.seek(pos);												 //stes the cursor to the last element in the file, by making use of the pos variable
	raf.writeBytes(text);										 // write the text to the end of the file
	raf.close();												 //closes the file
	}

public static void main(String[] args) throws Exception // main method to test class
{
	RandomAccess ra = new RandomAccess();
	String line = "\n Append this line to the end of the file.";
	ra.append("bankdetails.txt", line);
	}
}
