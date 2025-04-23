package java_fundamentals;

import java.util.Scanner; 

public class ConditionalStatement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			
		System.out.print("Enter age: ");
		int age = s.nextInt();
			
		//If-Else Statement
		if(age >= 18) {
			System.out.println("You have access");
		}else if(age >= 13){
			System.out.println("You may have access");
		}else {
			System.out.println("Access Denied");
		}
			
		//Nested Conditional Statement
		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter height: ");
		float height = s2.nextFloat();
		boolean isVerified = false;
			
		if (height >= 1.56f) {
			System.out.println("You are tall");
			if (isVerified) {
				System.out.println("You can be a player");
			}else {
				System.out.println("Not qualified");
			}
			
		}
		
		//Equals functions
		Scanner s3 = new Scanner(System.in);
		System.out.print("Enter Greetings: ");
		String greet = s3.nextLine();
		
		if(greet.equals("Hello")) {
			System.out.println("Hi");
		}
		
		//Logical Operations
		Scanner s4 = new Scanner(System.in);
		
		boolean hasRuler = true;
		boolean hasBallpen = true;
		
		if (hasRuler && hasBallpen) {
			System.out.println("You can come in");
		}else {
			System.out.println("You can come home");
		}
	}

}
