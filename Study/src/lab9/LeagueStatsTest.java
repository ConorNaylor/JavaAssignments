package lab9;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LeagueStatsTest {
	
	LeagueStats leagueStats = new LeagueStats();
	
	@Before
	public void setUp() throws Exception{
	

	League league = new League("PShip");
	leagueStats.add(league);
	
	Division div1 = new Division("1");
	Division div2 = new Division("2");
	
	league.add(div1);
	league.add(div2);
	
	Team team1 = new Team("Pool");
	Team team2 = new Team("Arse");
	Team team3 = new Team("Utd");
	Team team4 = new Team("Tot");
	
	div1.add(team1);
	div1.add(team2);
	div2.add(team3);
	div2.add(team4);
	
	Player player1 = new Player("Ron", 1, 30);
	Player player2 = new Player("Ron", 0, 30);
	Player player3 = new Player("Ron", 0, 30);
	Player player4 = new Player("Ron", 0, 30);
	Player player5 = new Player("Ron", 0, 30);
	Player player6 = new Player("Ron", 0, 30);
	Player player7 = new Player("Ron", 0, 30);
	Player player8 = new Player("Ron", 0, 30);
	Player player9 = new Player("Ron", 0, 30);
	Player player10 = new Player("Ron", 0, 30);
	Player player11 = new Player("Ron", 0, 30);
	Player player12 = new Player("Ron", 0, 30);
	
	team1.add(player1);
	team1.add(player2);
	team1.add(player3);
	team2.add(player4);
	team2.add(player5);
	team2.add(player6);
	team3.add(player7);
	team3.add(player8);
	team3.add(player9);
	team4.add(player10);
	team4.add(player11);
	team4.add(player12);
	
	
	
	
	}
	@Test
	public void getNumDivisionsTest() {
		int expected = 2;
		
		int actualResult = leagueStats.getNumDivisions();
		
		assertEquals(expected, actualResult);
	}
	
	@Test
	public void getNumTeamsTest() {
int expected = 4;
		
		int actualResult = leagueStats.getNumTeams();
		
		assertEquals(expected, actualResult);
	}
	
	@Test
	public void getNumGoalsForTeamTest() {
int expected = 1;
		
		int actualResult = leagueStats.getNumGoalsForTeam();
		
		assertEquals(expected, actualResult);
	}
	
	@Test
	public void getNumGoalsForDivisionTest() {
int expected = 0;
		
		int actualResult = leagueStats.getNumGoalsForDivision();
		
		assertEquals(expected, actualResult);
	}

}
