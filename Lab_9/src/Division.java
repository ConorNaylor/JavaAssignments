import java.util.ArrayList;

public class Division {
	
	private String name;
	private ArrayList<Team> teams = new ArrayList<Team>();

	public Division(String nm) {
		this.name = nm;
	}

	public void add(Team team1) {
		teams.add(team1);
	}
	public int getNumTeams() {
		return teams.size();
	}

	public int getGoalsD() {
		int total = 0;
		for(Team d : teams){
			total += d.getNumGoals();
			}
		return total;
	}

}
