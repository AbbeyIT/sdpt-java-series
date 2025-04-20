package java_fundamentals;

import java.util.Scanner;

public class InputAndArithmeticOperators {

	public static void main(String[] args) {
		
		String x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		x = scan.nextLine();
		
		System.out.println("You are " + x);

	}

}
