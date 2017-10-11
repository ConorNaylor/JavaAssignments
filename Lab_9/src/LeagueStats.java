
public class LeagueStats {
	
	private League league;
	private Team team;
	private Division division;

	public void add(League league) {
		this.league = league;
	}

	public int getNumDivisions() {
		return league.getNumDivisions();
	}

	public int getNumTeams(){
		return league.getNumTeams();	
	}

	public int getNumGoalsForDivision() {
		return division.getGoalsD();
	}

	public int getNumGoalsForTeam() {
		return team.getNumGoals();
	}

	public int getAngAgeOfTeam() {
		return team.avgAge();
	}
}
