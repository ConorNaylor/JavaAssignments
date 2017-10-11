package ariana;

public class Rocket {

	private double altitude = 0;
	public boolean malfunction = false;

	public static void main(String[] args) {

		Rocket ariana = new Rocket();
		VelocitySensor sensor = new VelocitySensor();
		INS navigation = new INS();

		while (!ariana.malfunction){
			double speed = sensor.getVelocity();
			double distance = navigation.calculateAltitude(speed);
			ariana.setAltitude(distance);
			ariana.output();
			
		
		if (ariana.getAltitude()>4000){
			System.out.println("mission accomplished");
			break;
		}
			
		}
	}

	public void setAltitude(double alt) {
		if (alt< altitude){
			malfunction = true;
			System.out.println("Houston, we have a problem. Major Telemetry Malfunction");
		}
		altitude = alt;
	}
	
	public double getAltitude() {
		return altitude;
	}

	public void output(){
		System.out.println("Ariana 5 altitude: " + altitude);
	}

}
