import java.util.ArrayList;
	
public class League {
	
	private String name;
	private ArrayList<Division> divisions = new ArrayList<Division>();
	private Division division = new Division();

	public League(String a) {
		this.name = a;
	}

	public void add(Division div2) {
		divisions.add(div2);	
	}

	public int getNumDivisions() {
		return divisions.size();
	}
	public int getNumTeams() {
		for(Division d: divisions){
			return division.getNumTeams();
		}
	}


}
