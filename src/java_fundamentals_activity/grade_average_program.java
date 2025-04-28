package java_fundamentals_activity;

import java.util.Scanner;

public class grade_average_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int grade1;
		int grade2;
		int grade3;
		int grade4;
		float result;
		
		System.out.print("Grade 1: ");
		grade1 = s.nextInt();
		
		System.out.print("Grade 2: ");
		grade2 = s.nextInt();
		
		System.out.print("Grade 3: ");
		grade3 = s.nextInt();
		
		System.out.print("Grade 4: ");
		grade4 = s.nextInt();
		
		result = (grade1 + grade2+ grade3 + grade4) / 4;
		
		System.out.println("Average: " + result);
		
		if (result > 100) {
			System.out.println("Invalid Grade");
		} else if (result >= 98 ) {
			System.out.println("With Highest Honors");
		} else if (result >= 95 ){
			System.out.println("With High Honors");
		} else if (result >= 90 ){
			System.out.println("With Honors");
		} else if (result >= 75 ){
			System.out.println("Passed");
		} else if (result <= 75 ){
			System.out.println("Failed");
		}
		
		
	}

}
