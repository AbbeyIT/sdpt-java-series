package java_fundamentals_activity;

import java.util.Scanner;

public class one_function_calculator {

	public static void main(String[] args) {
		
		float x;
		float y;
		float result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Num 1: ");
		x = scan.nextFloat();
		
		System.out.print("Num 2: ");
		y = scan.nextFloat();
		
		result = x / y;
		
		System.out.println("Result is");
		System.out.println(x + " / " + y + " = " + result);

	}

}
