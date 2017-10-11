package week1;

public class Aeroplane {
	
    private int cruisAltitude = 0;
    private int time = 0;
    private int ascentRate = 0;
 
    public void cTime(int newValue) {
         time = newValue;
    }
 
    public void cAltitude(int newValue) {
         cruisAltitude = newValue;
    }
    public void cRate() {
        ascentRate = cruisAltitude / time ;
    }
 
    public void printStates() {
         System.out.println("The rate of ascent of the plane is " + ascentRate + " m/s. Until it reaches a height of " + cruisAltitude + "m above sea level.");
    }
}
