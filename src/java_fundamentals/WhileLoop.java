package java_fundamentals;

public class WhileLoop {

	public static void main(String[] args) {
		
		//While Loop
		String[] names = {"Leo", "Roscoe", "Mick", "Toto", "Zac"};
		int i = 0;
		while(i < names.length) {
			if(names[i].equals("Toto")) { //Conditions in WHILE Loop
				System.out.println("We found " + names[i]);
				break;
			}
			i++;
		}
		
		//Do While Loop
		int x = 5;
		do {
			System.out.println(i);
			x++;
		} while(x < 5);
		
		//BREAK keyword
		int j = 0;
		while (j < 5) {
			System.out.println(j);
			j++;
			break;
		}
		System.out.println("FINISH");
		

	}

}
