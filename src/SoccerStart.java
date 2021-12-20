

import java.lang.String;
import java.util.Scanner;

public class SoccerStart {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		Team ajax = new Team("Ajax", "Amsterdam", 15, 12, 1);
		Team psv = new Team("PSV", "Eindhoven", 13, 13, 2);
		Team feyenoord = new Team("Feyenord", "Rotterdam", 14, 10, 3);
		
		System.out.println("Menu (select number): \n1: Team List\n2: City List\n3: League Table\n4: Simulate a Match");
		int userMenu = input.nextInt();
		
		
		if (userMenu == 1) {
			SoccerTeam menu = new SoccerTeam();
			menu.Team();
		}
		
	}
	
}
