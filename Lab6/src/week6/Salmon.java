package week6;

public class Salmon extends Fish {
	
	protected boolean edible = true;
	protected boolean swimsAgainstRiver = true;
	protected int edibleQual = 0;
	protected int colour =0;
	protected String name= "";


	/**
	 * constructor 1
	 */
	public Salmon(String name,int colour, int eatQ) {
		this.edibleQual = eatQ;
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals (Object obj){
		//check to make sure object is not pointing at null
		if (obj==null){ 
			return false;
		}
		
		if (!(obj instanceof Salmon)){ 
			return false;
		}
		
		Salmon c = (Salmon)obj;

		//test for equality
		if(this.edibleQual==c.edibleQual ){
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
		System.out.println("I can swim " + length + " metres upstream, and lay eggs.");
		
	}
	
	@Override
	public String toString(){
		
		return "I am " + name + " the Salmon. I have an edible quality " + edibleQual + " and a colour of pink " + colour + ".";
	}


}