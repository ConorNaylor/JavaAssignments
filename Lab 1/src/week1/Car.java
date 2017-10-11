package week1;

public class Car {
	
    private int distance = 0;
    private int time = 0;
    private int velocity = 1;
 
    public void changeDistance(int newValue) {
         distance = newValue;
    }
 
    public void changeVelocity(int newValue) {
         velocity = newValue;
    }
 
    public void time() {
         time = distance / velocity;
    }
 
    public void printStates() {
         System.out.println("Distance(Km):" + distance + " - Velocity(Km/hr):" + velocity + " - Time(hr):" + time  );
    }
}

