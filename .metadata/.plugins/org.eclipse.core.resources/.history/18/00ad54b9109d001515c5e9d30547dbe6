package week6;

public class Shark extends Fish {
	
	protected boolean canBite = true;
	protected int dangerLevel = 0;
	protected String name= "";


	/**
	 * constructor 1
	 */
	public Shark(String name, int lvl) {
		this.dangerLevel=lvl;
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals (Object obj){
		//check to make sure object is not pointing at null
		if (obj==null){ 
			return false;
		}
		// check to make sure obj is a Canary object
		if (!(obj instanceof Shark)){ 
			return false;
		}
		// Now we have to *cast* obj to a Canary object
		Shark s = (Shark)obj;

		//test for equality
		if(this.dangerLevel==s.dangerLevel){
			return true;
		}
		return false;
	}

	@Override
	public void move(int length) {
		swim(length);
	}

	@Override
	public void swim(int length) {
		System.out.println("I can fly " + length + " metres");
		
	}
	
	@Override
	public String toString(){
		return "My name is " + name + " the Shark, I have a danger level of " + dangerLevel ;
	}

}


