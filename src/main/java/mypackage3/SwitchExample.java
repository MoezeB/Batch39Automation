package mypackage3;

public class SwitchExample {

	public static void main(String[] args) {
		int number = 20; 
		switch(number) {
		case 10: System.out.println("10");break;
		case 20: System.out.println("20");break;
		case 30: System.out.println("30");break;
		default: System.out.println("Not in the range of 10, 20, or 30.");
		}
	}
}

//switch (value2) {
//case value1;
	//code to execute if expression evaluates to value1
//	break;
//default
	//code to execute if no other case values matches the expression
//}