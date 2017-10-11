package lab9;

import java.util.ArrayList;

public class Division {
	
	private ArrayList<Team> team = new ArrayList<Team>();
	
	private String name;

	public Division(String string) {
		this.name = string;
	}

	public void add(Team team1) {
		team.add(team1);
	}
	
	public int size(){
		return team.size();
	}

	public int getNumGoals() {
		int goals = 0;
		for(Team t: team){
		goals += t.getNumGoals();
		}
		return goals;
	}


}
