package hw3Q2variableAndMethod;

public class Computer {
	// variables are decleared
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	public Computer() { // Constructor Decleared

	}

	public void configuration() { // method implemented
		System.out.println("My Brand:" + Brand + "\nModel " + Model + "\nOperating System " + OperatingSystem
				+ "\nPrice " + price + "\nGrade " + grade + "\nMade in usa? Ans:" + madeInUsa);
	}

}
