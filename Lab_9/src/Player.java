
public class Player {
	
	private String name;
	private int goals;
	private int age;
	
	public int getAge(){
		return age;
	}
	
	public int getGoals(){
		return goals;
	}
	
	public Player(String string, int gls, int age) {
		this.name = string;
		this.goals = gls;
		this.age = age;
	}

}