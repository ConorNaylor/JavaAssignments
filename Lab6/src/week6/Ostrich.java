package week6;

public class Ostrich extends Bird {
	
	protected boolean thinLongLegs = true;
	protected int legQuality = 0;
	protected int tall = 0;
	protected boolean cannotFly = true;
	protected String name = "";
	
	public Ostrich(String name, int tll, int legQuality  ){
	this.tall = tll;
	this.legQuality = legQuality;
	this.name = name;
	}
	
	
	@Override
	public boolean equals (Object obj){
		//check to make sure object is not pointing at null
		if (obj==null){ 
			return false;
		}

		if (!(obj instanceof Ostrich)){ 
			return false;
		}
		
		Ostrich c = (Ostrich)obj;

		//test for equality
		if(this.legQuality==c.legQuality && this.tall==c.tall ){
			return true;
		}
		return false;
	}

	@Override
	public void move(int length) {
		fly(length);
	}

	@Override
	public void fly(int length) {
		System.out.println("I cannot fly " + length + " metres");
		
	}
	
	@Override
	public String toString(){
		
		return "I am " + name + " the Ostrich. I am " + tall + " cm tall. I have long thin legs of quality " + legQuality + ".";
	}

}

