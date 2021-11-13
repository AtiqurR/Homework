package hw7Q3Abstraction;

/*2 keywords
 *An Abstract Class can inherit only one Abstract Class or a regular class by extends keyword.
 *But An Abstract class can inherit interface by implements keyword more than one,
 *can't inherit interface by extends keyword
 */
public abstract class MedicalSchool {
	public abstract void anatomyLab(); // It is abstract method

	public void biochemistryLab() { // It is non abstract method

		System.out.println("Today is a sunny day");
	}

}
