import java.util.ArrayList;

public class Roster {
	private String teamName ="";
	private ArrayList <Player> teamlist;
	
	public Roster(String n)
	{
		teamName = n;
		teamlist = new ArrayList<Player>();
	}
	
	public void addToTeam (Player p)
	{
		teamlist.add(p);
	}
	
	public String displayRoster()
	{
		return "Team name:" + teamName + "Team List: " + teamlist;
	}

	public ArrayList<Player> getTeamlist() {
		return teamlist;
	}

	public void setTeamlist(ArrayList<Player> teamlist) {
		this.teamlist = teamlist;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
}
