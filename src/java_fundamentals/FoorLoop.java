package java_fundamentals;

import java.util.Scanner;

public class FoorLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] names = {"Leo", "Roscoe", "Mick", "Toto", "Zac"};
		
		System.out.print("Name to Search: ");
		String search = scan.nextLine();
		
		for (int i = 0; i < names.length; i++) {
			
			if(names[i].equalsIgnoreCase(search)){
				System.out.println("We found " + names[i]);
				break;
			}else {
				System.out.println(names[i]);
			}
		}

	}

}
