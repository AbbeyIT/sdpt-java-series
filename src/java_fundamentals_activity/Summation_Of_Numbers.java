package java_fundamentals_activity;

public class Summation_Of_Numbers {

	public static void main(String[] args) {
		
		int numbers[] = {3,6,9,6,1};
		int result = summation(numbers);
		System.out.println(result);
	}
	
	static int summation(int numbers[]) {
		int sum = 0;
		
		for(int number: numbers) {
			sum += number;
		}
		return sum;
	}

}
