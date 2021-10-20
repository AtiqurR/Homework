package hw2Q2JavaVariables;

public class AboutUs {
	// All the variables are decleared here
	public String MyName;
	public byte myAge;
	public short myHouseRent;
	public int myYearlySalary;
	public long myBankBalance;
	public char mySex;
	public float myHeight;
	public double myGrade;
	public boolean usCitizen;

	public AboutUs() { // Constructor decleared
		System.out.println("This is all about me:");

	}

	public void aboutUs() { // method implemented
		// method
		System.out.println("My Name is:" + MyName + "\nMy Age" + myAge + "\nMy HouseRent" + myHouseRent
				+ "\nMy YearlySalary" + myYearlySalary + "\nMy BankBalace" + myBankBalance + "\nSex" + mySex
				+ "\nMy Height" + myHeight + "\nMy Grade" + myGrade + "\nI am UsCitizen? Ans:" + usCitizen);
	}

}
