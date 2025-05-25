package java_fundamentals_activity;

import java.util.Scanner;

public class Quiz_game_w_lives {

	public static void main(String[] args) {
		
		int lives = 3; 
		Scanner scan = new Scanner(System.in);
		
		while (lives > 0) {
			System.out.println("Who is the 2024 F1 World Champion? ");
			System.out.print("Answer: ");
			String champion = scan.nextLine();
			
			if (champion.equals("Max")){
				break;
			}else {
				lives --;
			}		
		}
		if (lives > 0){
			System.out.println("You Won!");
		}else {
			System.out.println("You LOSE!");
		}	
			
	}

}
