public class Team {
	
	private String teamName;
	private String cityName;
	private int atkRating;
	private int defRating;
	private int tableRank;
	
	
	public Team(String teamName, String cityName, int atkRating, int defRating, int tableRank) {
		this.teamName = teamName;
		this.cityName = cityName;
		this.atkRating = atkRating;
		this.defRating = defRating;
		this.tableRank = tableRank;
		
	}
	
	public void teamName() {	
		System.out.println(this.teamName);
		
	}
	
	public void cityName() {
		System.out.println(this.cityName);
	}
	
	public void tableRank() {
		System.out.println(this.teamName + " " + this.tableRank);
	}
	
	
} 
