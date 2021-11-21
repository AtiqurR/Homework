package hw10Q2Polymorphism;

public class TestFamily {
	public static void main(String[] args) {

		System.out.println("\n............Sister............\n");
		Sister sister = new Sister();
		sister.sister(); // Void type method 01 initialized
		sister.sister(10, 15, 20); // Return type parameterized method 02 Initialized
		sister.sister(10, 15); // Return type parameterized method 03 Initialized
		sister.sister(10, 15, "7"); // Return type parameterized method 04 Initialized
		sister.sister(10, 15, 20, 25); // Final method 05 Initialized
		Sister.sister(10, 15, 20, 25, 30); // static type parameterized method 06 Initialized
		sister.sister(10, 15, 20, 25, 30, 40); // Void type parameterized method 07 Initialized

		System.out.println("\n.............Niece............\n");
		Niece niece = new Niece();
		niece.sister(); // Void type method 01 initialized
		niece.sister(25, 40, 15); // Return type parameterized method 02 Initialized
		niece.sister(40, 25); // Return type parameterized method 03 Initialized
		niece.sister(60, 75, "15"); // Return type parameterized method 04 Initialized
		niece.sister(70, 45, 20, 25); // Final method 05 Initialized
		Niece.sister(45, 35, 40, 25, 30); // static type parameterized method 06 Initialized
		niece.sister(30, 15, 20, 75, 30, 40); // Void type parameterized method 07 Initialized

	}

}
