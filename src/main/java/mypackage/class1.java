package mypackage;

public class class1 {

	public static void main(String[] args) {
		
		System.out.println("Hello world my name is Moeze");
//		System.out.println("fun");
//		System.out.println("fun");			
//		System.out.println("fun");
//		System.out.println("fun");	
//  	1. datatype  2.Variable Name 3. Operand  4. Data Value 
		
		byte byteVariable = 127; // -128 to 127, default = 0
		short shortVariable = 32767; //-322768 to 32767, default = 0
		int intVariable = 10000; //-2147483648 to 2147483648, default = 0
		long longVariable = 1000000L; //-2^64 to 2^64, default = 0
	
		String name = "Moeze";
		
//		System.out.println("byteVariable = " + byteVariable);
//		System.out.println("total = " + intVariable + " + " + shortVariable);
		
		double doubleVariable = 10.25; 
		char charVariable = 'a'; 
		boolean booleanVariable = true; 

		int sum; 
		int sum2;
		byte bigV = 100;
		int smallV = 1000;
		
		sum = byteVariable * 2; 
		sum2= bigV + smallV;
		
		System.out.print("sum2 = " + sum2);
	}
	
}
