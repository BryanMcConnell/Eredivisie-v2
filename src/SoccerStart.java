

import java.lang.String;
import java.util.Scanner;

public class SoccerStart {
	

	public static void main(String[] args) {
		
		Team ajax = new Team("Ajax", "Amsterdam", 15, 12, 1);
		Team psv = new Team("PSV", "Eindhoven", 13, 13, 2);
		Team feyenoord = new Team("Feyenord", "Rotterdam", 14, 10, 3);
		
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Menu (select number): \n1: Team List\n2: City List\n3: League Table\n4: Simulate a Match");
		int userMenu = input.nextInt();
		
		switch(userMenu) {
		case 1: ajax.teamName();
				psv.teamName();
				feyenoord.teamName();
		case 2: ajax.cityName();
				psv.cityName();
				feyenoord.cityName();
		case 3: ajax.tableRank();
				psv.tableRank();
				feyenoord.tableRank();
		}
		 
	}
	
}

