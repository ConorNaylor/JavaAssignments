package week6;

public class Zoo {
	
	public static void main(String[] args){
	
	Canary bob = new Canary("Bob", 2 , 3);
	System.out.println(bob);
	bob.fly(10);
	
	Canary joe = new Canary("Joe", 2 , 3);
	
	Shark shane = new Shark("Shane", 3);
	System.out.println(shane);
	
	boolean isequal = bob.equals(joe);
	if (isequal){
		System.out.println("Bob equals Joe");
	}
	else{
		System.out.println("Bob doesn't equal Joe");
	}
	}
}
