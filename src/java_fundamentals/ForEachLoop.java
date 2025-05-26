package java_fundamentals;

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] names = {"Leo", "Roscoe", "Mick", "Toto", "Zac"}; 
		
		System.out.print("Name to Search: ");
		String search = scan.nextLine();
		
		for(String name: names) {
			if(name.equalsIgnoreCase(search)) {
				System.out.println("We found " + name);
				break;
			}else {
				System.out.println(name);
			}
		}

	}

}
