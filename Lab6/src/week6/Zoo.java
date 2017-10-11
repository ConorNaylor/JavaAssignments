package week6;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canary joe = new Canary("Joe", 0, 1);
		System.out.println(joe.toString());
		joe.fly(10);
		
		Canary mary = new Canary("Mary", 5, 2);
		System.out.println(mary.toString());
		mary.fly(20);
		
		boolean isEqual = joe.equals(mary);
		if (isEqual) {
			System.out.println("Joe and Mary are equal.");
		}
		else {
			System.out.println("Joe and Mary are not equal.\n");
		}
			
		    NorwegianBlue john = new NorwegianBlue("John", 0, 0);
		    Ostrich oscar = new Ostrich("Oscar", 200, 1);
		    System.out.println(oscar.toString());
		    System.out.println(john.toString());
		    
		    boolean isEqual2 = oscar.equals(john);
		    if(isEqual2){
		    	System.out.println("John and Oscar are equal.");
		    }
		    else{
		    	System.out.println("John and Oscar are not equal.\n");
		    }
	
		   Shark shane = new Shark("Shane", 9);
		   Salmon tom = new Salmon("Tom", 6, 3);
		   System.out.println(shane.toString());
		   shane.swim(100);
		    System.out.println(tom.toString());
		    tom.swim(50);
		   boolean isEqual3 = shane.equals(tom);
			if (isEqual3) {
				System.out.println("Shane and Tom are equal.");
			}
			else {
				System.out.println("Shane and Tom are not equal.\n");
			}

	}
}

