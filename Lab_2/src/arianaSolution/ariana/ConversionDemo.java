package arianaSolution.ariana;

public class ConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 7;
		double y = x; //implicit conversion
		System.out.println(y);
		
		double xx = 7.1;
		int yy = (int) xx; // explicit conversion
		System.out.println(yy);
		
		int xz = 7;
		float yf = x; //implicit conversion
		System.out.println(yf);
		
		float xf = 7.1f;
		int yz = (int) xf; // explicit conversion
		System.out.println(yz);
		
		char c = 'a';
		int cx = c; // implicit conversion
		System.out.println(cx);
		
		int cy = 99; 
		char cz = (char)cy; // explicit conversion
		System.out.println(cz);
		
		short s = 5;
		int sx = s; // implicit conversion
		System.out.println(sx);
		
		int sz = 1234567776; 
		short zs = (short)sz; // explicit conversion
		System.out.println(zs);
		
		byte b = 5;
		short bx = b; // implicit conversion
		System.out.println(bx);
		
		double d = 123444.9;
		byte bz = (byte)d; // explicit
		System.out.println(bz);
		
		int xl = 3444;
		long l = xl; //implicit
		System.out.println(l);
		
		float fx = 56.8f;
		int zf = (int)fx; // explicit
		System.out.println(zf);
		
		float fs = 56.8f;
		short sf = (short)fs; // explicit
		System.out.println(sf);
		
		float fb = 233356.8f;
		byte bf = (byte)fb; // explicit
		System.out.println(bf);
		
		char cd = '3';
		double dc = cd; //implicit
		
		System.out.println(dc);

	}

}
