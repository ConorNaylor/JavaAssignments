package ariana;

public class QuestionA {

public static void main(String[] args) {
	
	int A = 100;
	double B = (double)A;
	System.out.println("B = " +B); // A != B as a int is converted to a float which adds a decimal place to the number.
	
	double A2 = 10.00235;
	int B2 = (int)A2;
	System.out.println("B2 = " +B2); // A2 != B2 as doubke is converted to an int therefore it looses all values after the decimal place.
	
	int A3 = 5;
	float B3 = (float)A3;
	System.out.println("B3 = " +B3);
	
	float A4 = 7.23f;
	int B4 = (int)A4;
	System.out.println("B4 = " +B4);
	
	int A5 = 24;
	float B5 = (float)A5;
	System.out.println("B5 = " +B5);
	
	char A6 = 32;
	int B6 = A6;
	System.out.println("B6 = " +B6);
	
	int A7 = 50;
	char B7 = (char)A7;
	System.out.println("B7 = " +B7);
	
	short A8 = 4;
	int B8 = (int)A8;
	System.out.println("B8 = " +B8);
	
	int A9 = 15;
	short B9 = (short)A9;
	System.out.println("B9 = " +B9);
	
	byte A10 = 21;
	short B10 = (short)A10;
	System.out.println("B10 = " +B10);
	
	double A11 = 12.234256;
	byte B11 = (byte)A11;
	System.out.println("B11 = " +B11);
	
	int A12 = 1345;
	long B12 = (long)A12;
	System.out.println("B12 = " +B12);
	
	float A13 = 19.576f;
	int B13 = (int)A13;
	System.out.println("B13 = " +B13);
	
	float A14 = 22.456f;
	short B14 = (short)A14;
	System.out.println("B14 = " +B14);
	
	float A15 = 13.23453f;
	byte B15 = (byte)A15;
	System.out.println("B15 = " +B15);
	
	char A16 = 99;
	double B16 = (double)A16;
	System.out.println("B16 = " +B16);
	
	
	
}

}