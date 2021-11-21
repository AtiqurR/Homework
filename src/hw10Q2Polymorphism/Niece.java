package hw10Q2Polymorphism;

public class Niece extends Sister {
	// Method 01
	@Override
	public void sister() {
		System.out.println("This is a void type method from sister class");
	}

	// Method 02
	@Override
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3 - 5;
		System.out.println("Total is from local Sister: " + total1);
		return total1;

	}

	// Method 03
	@Override
	public int sister(int age1, int age2) {
		int total2 = age1 + age2 * 2;
		System.out.println("Total is from local Sister: " + total2);
		return total2;
	}

	// Method 04
	@Override
	public int sister(int age1, int age2, String age4) {
		int total3 = age1 + age2 / 5 + Integer.parseInt(age4);
		System.out.println("Total is from local Sister: " + total3);
		return total3;

	}

	// Method 05
	@Override
	public void sister(int age1, int age2, int age3, int age4, int age5, int age6) {
		int total6 = age1 / 5 + age2 + age3 + age4 + age5 + age6 / 2;
		System.out.println("Total is from local Sister: " + total6);

	}

	/*
	 * Final type method cannot be Overriden because final method is final it cannot
	 * change anywhere.
	 * 
	 * And here final method is override from sister so it cannot change
	 * 
	 * But If we remove final keyword from sister class then here we can use final
	 * method no eror
	 * 
	 * 
	 * // Method 06
	 * 
	 * @Override public final int sister(int age1, int age2, int age3, int age4) {
	 * int total4 = age1 + age2 + age3 + age4;
	 * System.out.println("Total is from local Sister: " + total4); return total4;
	 * 
	 * }
	 */

	/*
	 * The static method sister can't override or implemented because sister static
	 * method belongs to sister class. Niece extends sister rather static method
	 * sister cannot override here in niece class. But if we remove @Override here
	 * we can use this sister static method in Niece class
	 * 
	 * // Method 07
	 * 
	 * @Override public static int sister(int age1, int age2, int age3, int age4,
	 * int age5) { int total5 = age1 + age2 + age3 + age4 + age5;
	 * System.out.println("Total is from local Sister: " + total5); return total5; }
	 */

	/*
	 * Method Overriding: When different methods with the same name with same
	 * parameter & signature but logic or syntax are different then it is called
	 * method overriding. Method Overriding occurs during run time.
	 * 
	 * Method overriding is also called dynamic polymorphism,late binding & run time
	 * polymorphism
	 */

}
