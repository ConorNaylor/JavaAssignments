package lab9;

public class Player {
	
	private String name;
	private int goals;
	private int age;
	
	public Player(String string, int g, int a){
		this.name = string;
		this.goals = g;
		this.age = a;
	}

	public int numGoals() {
		return goals;
	}
 
	public int age(){
	return age;
	}
}
