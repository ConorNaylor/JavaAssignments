package lab9;

public class LeagueStats {
	
	private League league;

	public void add(League league) {
		this.league = league;
		
	}

	public int getNumDivisions() {
		return league.getNumDivisions();
		
	}

	public int getNumTeams() {
		return league.getNumTeams();
	}

	public int getNumGoalsForTeam() {
		return league.getNumGoalsForTeam();
	}

	public int getNumGoalsForDivision() {
		return league.getNumGoalsForDivision();
	}
	
}
