import java.util.Scanner;

public class SoccerTeam {
	
	
	
	
	Scanner input = new Scanner(System.in);
		
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
	
	

	

	
}





