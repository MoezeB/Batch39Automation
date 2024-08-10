package mypackage3;

public class IfElseExample {

	public static void main(String[] args) {
		int number = 13;

		if (number % 2 == 0) {
			System.out.println("even number");
			System.out.println("condition -> true");
		} else {
			System.out.println("odd number");
			System.out.println("condition -> false");
			System.out.println("_____________________");
		}

		// Additional calculations and print results
		int result1 = 10 % 3;
		int result2 = 12 % 4;

		//System.out.println("result1 (10 % 3) = " + result1);
		System.out.println("result2 (12 % 4) = " + result2);
		
		if (result2 % 2 == 0) {
			System.out.println("even number");
			//System.out.println("condition -> true");
		} else {
			System.out.println("odd number");
			//System.out.println("condition -> false");
		}

		
	}
}