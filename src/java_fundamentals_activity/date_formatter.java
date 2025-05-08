package java_fundamentals_activity;

import java.util.Scanner;

public class date_formatter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Month: ");
		int month = scan.nextInt();
		
		System.out.print("Day: ");
		int day = scan.nextInt();
		
		System.out.print("Year: ");
		int year = scan.nextInt();
		
		String monthWord;
		
		switch(month) {
		case 1:
			monthWord = "January";
			break;
		case 2:
			monthWord = "February";
			break;
		case 3:
			monthWord = "March";
			break;
		case 4:
			monthWord = "April";
			break;
		case 5:
			monthWord = "May";
			break;
		case 6:
			monthWord = "June";
			break;
		case 7:
			monthWord = "July";
			break;
		case 8:
			monthWord = "August";
			break;
		case 9:
			monthWord = "September";
			break;
		case 10:
			monthWord = "October";
			break;	
		case 11:
			monthWord = "November";
			break;
		case 12:
			monthWord = "December";
			break;
		
		
		
		}
		
		
	}

}
