import java.util.ArrayList;

public class Team {
	
	private String name;
	private ArrayList<Player> players = new ArrayList<Player>();

	public Team(String string) {
		this.name = string;
	}

	public void add(Player plr) {
		players.add(plr);
	}
	
	public int avgAge(){
		int total = 0;
		for(Player p: players){
			total += p.getAge();
		}
		return total/players.size();
	}
	public int getNumGoals() {
		int total = 0;
		for(Player d : players){
		total += d.getGoals();
		}
		return total;
	}
}
