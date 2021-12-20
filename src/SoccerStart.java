

import java.lang.String;
import java.util.Scanner;

public class SoccerStart {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Menu (select number): \n1: Team List\n2: City List\n3: League Table\n4: Simulate a Match");
		int userMenu = input.nextInt();
		
		
		if (userMenu == 1) {
			SoccerTeam listTeam = new SoccerTeam();
			listTeam.teamList();
			
		}
		 
	}
	
}

