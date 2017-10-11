package arianaSolution.ariana;

public class INS{
	
	private double total = 0;

	public static short reading_frequency = 5;// every 5 seconds
	
	//public short calculateAltitude (double velocity){
	public double calculateAltitude (double velocity){

		//short reading = (short)velocity;
		//total =   (short)(total + reading);
		total = total + velocity;
	
		//short altitude = (short) (total * reading_frequency/60);
		double altitude =  (total * reading_frequency/60);
		return altitude;
		
	}
}
