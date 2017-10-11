package week6;

public  class Shark extends Fish {
	
	protected boolean bite = true;
	protected int dangerLevel =0;
	protected String name= "";


	/**
	 * constructor 1
	 */
	public Shark(String name, int danger) {
		this.dangerLevel = danger;
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals (Object obj){
		//check to make sure object is not pointing at null
		if (obj==null){ 
			return false;
		}
		
		if (!(obj instanceof Shark)){ 
			return false;
		}
	
		Shark c = (Shark)obj;

		//test for equality
		if(this.dangerLevel==c.dangerLevel ){
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
		System.out.println("I can swim " + length + " metres");
		
	}
	
	@Override
	public String toString(){
		
		return "I am " + name + " the Shark. I am " + dangerLevel + " out of 10 on the danger scale.";
		
	}

}
