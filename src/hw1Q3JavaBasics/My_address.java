package hw1Q3JavaBasics;

public class My_address {
	public static String MyName = "Atiqur Rahman";
	public static int houseNumber = 2256;
	public static char houseLocation = 'E';
	public static String streetName = "Waterbury";
	public static String streetType = " Avenue";
	public static String state = "Ny -";
	public static int zipCode = 10462;
	public static boolean inUSA = false;

	public static void my_address() {

		System.out.println("This is my address");
		System.out.println(MyName + "\n" + houseNumber + houseLocation + " " + streetName + streetType + "\n " + state
				+ zipCode + "\n" + "I am a usCitizen? Ans:" + inUSA);
	}

	public static void main(String[] args) {

		
		
		
		my_address();
	}

}
