package lab9;

import java.util.ArrayList;

public class League {
	
	private ArrayList<Division> divisions = new ArrayList<Division>();
	
	private String name;

	public int getNumTeams(){
		int size = 0;
		for(Division d: divisions){
			size += d.size();
		}
		return size;
	}
	

	public League(String string){
		this.name = string;
	}

	public void add(Division div1){
	divisions.add(div1);	
	}

	public int getNumDivisions() {
		return divisions.size();
	}


	public int getNumGoalsForTeam() {
		return 0;
	}


	public int getNumGoalsForDivision() {
		int goals = 0;
		for(Division d: divisions){
			goals += d.getNumGoals();
		}
		return goals;
	}
}
