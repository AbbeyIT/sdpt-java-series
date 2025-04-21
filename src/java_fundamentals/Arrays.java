package java_fundamentals;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {	
		
		//Declaring w/ values
		String names[] = {"Oscar", "Max", "Lando"};
		
		//Declaring w/o values
		String cars[] = new String[3];
		cars[0] = "Mclaren";
		
		//Reading Array Element
		System.out.println(names[0]);
		
		//Assigning Array Element
		System.out.println(cars[0]);
		
		//Assigning Array Element w/ User Input
		Scanner s = new Scanner(System.in);
		String teamLeaders[] = new String[5];
		
		System.out.print("Enter a leader name: ");
		teamLeaders[0] = s.nextLine();
		
		System.out.println(teamLeaders[0]);

	}

}
