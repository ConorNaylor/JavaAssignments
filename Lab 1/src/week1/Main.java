package week1;

public class Main {
	
	public static void main(String[] args) {
		
		 Car car1 = new Car();
		 Car car2 = new Car();
		
		 car1.changeDistance(100);
		 car1.changeVelocity(25);
		 car1.time();
		 System.out.println("");
		 System.out.println("Car Class:");
		 car1.printStates();

		 car2.changeDistance(100);
		 car2.changeVelocity(50);
		 car2.time();
		 car2.printStates();
		 
		 Aeroplane plane1 = new Aeroplane();
		 Aeroplane plane2 = new Aeroplane();
		 
		 plane1.cTime(500);
		 plane1.cAltitude(10000);
		 plane1.cRate();
		 System.out.println("");
		 System.out.println("Aeroplane Class:");
		 plane1.printStates();

		 plane2.cTime(600);
		 plane2.cAltitude(12000);
		 plane2.cRate();
		 plane2.printStates();
		 
		 Table table1 = new Table();
		 Table table2 = new Table();
		
		 table1.changeLength(75);
		 table1.changeWidth(25);
		 table1.area();
		 System.out.println("");
		 System.out.println("Table Class:");
		 table1.printStates();

		 table2.changeLength(100);
		 table2.changeWidth(30);
		 table2.area();
		 table2.printStates(); 
		 
	}


}
