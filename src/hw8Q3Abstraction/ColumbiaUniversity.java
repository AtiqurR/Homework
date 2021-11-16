package hw8Q3Abstraction;

/*how many keywords are used for the inheritance in Java for a regular Class? Ans:2 keywords
 *A Regular Class can inherit only one Abstract Class or a regular class by extends keyword.
 *But A Regular class can inherit interface by implements keyword more than one,
 *can't inherit interface by extends keyword
 */
public class ColumbiaUniversity extends MedicalSchool {

	// if we want to make a abstract method in regular class we need to make the
	// class to abstract
	// public void chemistry();

	public void biology() {
		System.out.println("I am still trying");
	}

	public ColumbiaUniversity() { // Default Constructor

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

}
