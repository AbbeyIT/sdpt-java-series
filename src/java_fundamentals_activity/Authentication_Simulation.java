package java_fundamentals_activity;

import java.util.Scanner;

public class Authentication_Simulation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] username = {"max01", "lewis44", "daniel3"};
		String[] password = {"simracing", "roscoe", "shoe"};
		
		boolean isExist = false;
		
		System.out.print("Username: ");
		String uname = scan.nextLine();		
		
		System.out.print("Password: ");
		String pass = scan.nextLine();
		
		for (int i = 0; i < username.length; i++) {
			if(uname.equalsIgnoreCase(username[i]) && pass.equalsIgnoreCase(password[i])){
				isExist = true;
				break;
			}
		}
		
		if (isExist) {
			System.out.println("Welcome " + uname);
		}else {
			System.out.println("Account Not Found");
		}
			

	}

}
