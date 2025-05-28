package java_fundamentals;

public class TwoDimensionalArraysAndNestedForLoops {

	public static void main(String[] args) {
		
		// With Values
		String users[][] = {
				{"Toto", "Mercedes"},
				{"James", "Williams"},
				{"Horner", "Red Bull"},
				{"Zac", "McLaren"},
		};
		
		// Without values
		int numbers[][] = new int[4][2];
		
		// Accessing 2D Arrays
		// Read
		System.out.println(users[3][0]);
		// Write
		users[2][1] = "Haas";
		System.out.println(users[2][1]);
		
		System.out.println(" ");
		
		// Iterate 2D Arrays - to read the whole 2D Array
		String leaders[][] = {
				{"Toto", "Mercedes"},
				{"James", "Williams"},
				{"Horner", "Red Bull"},
				{"Zac", "McLaren"},
		};
		
		for (int row = 0; row < leaders.length; row++) {
			
			for(int col = 0; col < leaders[row].length; col++) {
				System.out.println(leaders[row][col]);
			}
		}
		
		System.out.println(" ");
		
		// Iterate 2D Arrays (For each loop)
		for(String user[]:users) {
			
			for(String info:user) {
				System.out.println((info));
			}
		}
		
		
		
	}

}
