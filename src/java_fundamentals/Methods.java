package java_fundamentals;

public class Methods {
	
	/* Global Variables are variable declared within a class, it can be accessed within the whole class */

	public static void main(String[] args) { 
		
		/* Local Variables are variables declared inside a method, conditions, loops, and 
		 * any other block of code, it can only be accessible within that block of code.
		 */
		
		//Local Variable
		String greetings = "What's up";
		System.out.println(greetings);
		
		
		// CALLING Methods
		sayHello();
		
		print("Arguements");
		
		add(2,5);
		
		int difference = substract(38,5);
		System.out.println(difference);
		System.out.println(substract(30,2));
		System.out.println(substract(30,2,1));
		
	}
	
	/* Methods are used to divide and sort Functionalities within a class 
	 * so that the code will be readable even if its long. */
	
	// CREATING Methods
	static void sayHello() {
		print("Hello");
	}
	
	/*Arguments / Parameters - a value that needs to be passed on a Method so that the method 
	 * can use that value and perform various operations on it.
	 */
	static void print(String word) {
		System.out.println(word);
	}
	
	static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	/* RETURN keyword is used to return a value from the method. It is used when a method has a result. */
	static int substract(int num1, int num2) {
		return(num1 - num2);
	}
	
	/* OVERLOADING Methods - you can use the same method name but different parameters so that you will
	 * cater every possibility of a method.
	 */
	
	static int substract(int num1, int num2, int num3) {
		return(num1 - num2 - num3);
	}

}
