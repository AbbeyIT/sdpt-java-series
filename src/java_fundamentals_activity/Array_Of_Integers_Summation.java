package java_fundamentals_activity;

public class Array_Of_Integers_Summation {

	public static void main(String[] args) {
		int[] numbers = {1,3,5,7,26,2,6};
		int sum = 0;
		
		for(int num:numbers) {
			sum += num;
		}
		System.out.println("The sum is " + sum);

	}

}
