package hw10Q2Polymorphism;

public class Sister {

	// Void type method implemented -01
	public void sister() {
		System.out.println("This is a void type method from sister class");
	}

	// Return type parameterized method implemented -02
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3;
		System.out.println("Total is from local Sister: " + total1);
		return total1;

	}

	// Return type parameterized method implemented -03
	public int sister(int age1, int age2) {
		int total2 = age1 + age2;
		System.out.println("Total is from local Sister: " + total2);
		return total2;
	}

	// Return type parameterized method implemented -04
	public int sister(int age1, int age2, String age4) {
		int total3 = age1 + age2 + Integer.parseInt(age4);
		System.out.println("Total is from local Sister: " + total3);
		return total3;

	}

	// Final method implemented -05
	public final int sister(int age1, int age2, int age3, int age4) {
		int total4 = age1 + age2 + age3 + age4;
		System.out.println("Total is from local Sister: " + total4);
		return total4;

	}

	// Static type Method implemented -06
	public static int sister(int age1, int age2, int age3, int age4, int age5) {
		int total5 = age1 + age2 + age3 + age4 + age5;
		System.out.println("Total is from local Sister: " + total5);
		return total5;
	}

	// void type parameterized method implemented 07
	public void sister(int age1, int age2, int age3, int age4, int age5, int age6) {
		int total6 = age1 + age2 + age3 + age4 + age5 + age6;
		System.out.println("Total is from local Sister: " + total6);

	}

	/*
	 * Method Overloading: When different methods with the same name but parameter &
	 * signature are different then it is called method overloading. Method
	 * Overloading occurs during compile time.
	 * 
	 * Method overloading is also called static polymorphism,early binding,compile
	 * time polymorphism
	 */

}
