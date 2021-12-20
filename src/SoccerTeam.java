import java.util.Scanner;

public class SoccerTeam {
	
	Scanner input = new Scanner(System.in);
	
	String teamName = "";
	String cityName = "";
	int atkRating;
	int defRating;
	int tableRank;
	
	private int changeAtkRating() {
		
		System.out.println("Enter the new Attack Rating: ");
		int newAtkRating = input.nextInt();
		return newAtkRating;
	}
	
	private int changeDefRating() {
		
		System.out.println("Enter the new Defense Rating: ");
		int newDefRating = input.nextInt();
		return newDefRating;
	}
	
	private int changeTableRank() {
		
		System.out.println("Enter the new table position ");
		int newTableRank = input.nextInt();
		return newTableRank;
	}
	
	protected void teamList() {
		
		Team ajax = new Team("Ajax", "Amsterdam", 15, 12, 1);
		Team psv = new Team("PSV", "Eindhoven", 13, 13, 2);
		Team feyenoord = new Team("Feyenord", "Rotterdam", 14, 10, 3);
		System.out.println(ajax.teamName + "\n" + psv.teamName + "\n" + feyenoord.teamName);
	}
	
}

class Team extends SoccerTeam {
	public Team(String teamName, String cityName, int atkRating, int defRating, int tableRank) {
		this.teamName = teamName;
		this.cityName = cityName;
		this.atkRating = atkRating;
		this.defRating = defRating;
		this.tableRank = tableRank;
		
		
		
	}
	
}

/** class MenuOne {
	
	public void oneMenu() {
		
		SoccerTeam listT = new SoccerTeam();
		System.out.println(listT.teamList());
		
	}
	
} **/
