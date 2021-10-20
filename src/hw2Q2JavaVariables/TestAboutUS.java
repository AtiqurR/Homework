package hw2Q2JavaVariables;

public class TestAboutUS {

	public static void main(String[] args) {
		AboutUs aboutUs = new AboutUs(); // Constructor initialized
		aboutUs.MyName = "Anik"; // variables initialized from this line
		aboutUs.myAge = 26;
		aboutUs.myHouseRent = 12000;
		aboutUs.myYearlySalary = 150000;
		aboutUs.myBankBalance = 102457156555l;
		aboutUs.mySex = 'M';
		aboutUs.myHeight = 5.6f;
		aboutUs.myGrade = 3.5645655559754;
		aboutUs.usCitizen = false;
		aboutUs.aboutUs(); // method initialized

		System.out.println("*************************************");

		AboutUs aboutUs2 = new AboutUs();
		aboutUs2.MyName = "Alex";
		aboutUs2.myAge = 30;
		aboutUs2.myHouseRent = 28000;
		aboutUs2.myYearlySalary = 210000;
		aboutUs2.myBankBalance = 268794561357l;
		aboutUs2.mySex = 'M';
		aboutUs2.myHeight = 6.6f;
		aboutUs2.myGrade = 3.578448515588;
		aboutUs2.usCitizen = true;
		aboutUs2.aboutUs(); // method initialized

	}

}
