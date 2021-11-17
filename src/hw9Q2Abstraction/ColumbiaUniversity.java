package hw9Q2Abstraction;

/*how many keywords are used for the inheritance in Java for a regular Class? Ans:2 keywords
 *A Regular Class can inherit only one Abstract Class or a regular class by extends keyword.
 *But A Regular class can inherit interface by implements keyword more than one,
 *can't inherit interface by extends keyword
 */
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// if we want to make a abstract method in regular class we need to make the
	// class to abstract
	// public void chemistry();

	public void biology() {
		System.out.println("This method is from ColumbiaUniversity class");
	}

	public static void columbiaUniversity() {
		System.out.println("This is a static method of ColumbiaUniversity class");
	}

	public ColumbiaUniversity() { // Default Constructor

	}

	@Override
	public void anatomyLab() {
		System.out.println("This method is from MedicalSchool class");

	}

	@Override
	public void commonRoom() {
		System.out.println("This method is from College interface");
	}

	@Override
	public void laboratory() {
		System.out.println("This method is from College interface");
	}

	@Override
	public void languageClub() {
		System.out.println("This method is from College interface");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("This method is from Hospital interface");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("This method is from Hospital interface");
	}

	@Override
	public void cafeteria() {
		System.out.println("This method is from Hospital interface");
	}

	@Override
	public void lawInfo() {
		System.out.println("This method is from LawSchool interface");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("This method is from AeronauticalSchool interface");
	}

	@Override
	public void vocationalInfo() {
		System.out.println("This method is from VocationalSchool interface");
	}

	@Override
	public void classSize() {
		System.out.println("This method is from University interface");

	}

	@Override
	public void playGround() {
		System.out.println("This method is from University interface");
	}

	@Override
	public void teacher() {
		System.out.println("This method is from University interface");
	}

	@Override
	public void hygiene() {
		System.out.println("This method is from NursingSchool Class");
	}

	@Override
	public void mechanicalLab() {
		System.out.println("This method is from  EngineeringSchool Class");
	}

}
