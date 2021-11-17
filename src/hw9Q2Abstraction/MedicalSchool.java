package hw9Q2Abstraction;

/* how many keywords are used for the inheritance in Java for Abstract Class? Ans:2 keywords
 *An Abstract Class can inherit only one Abstract Class or a regular class by extends keyword.
 *But An Abstract class can inherit interface by implements keyword more than one,
 *can't inherit interface by extends keyword
 */
public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public abstract void anatomyLab(); // It is abstract method

	public void biochemistryLab() { // It is non abstract method

		System.out.println("Today is a sunny day");
	}

	public static void medicalSchool() {
		System.out.println("This is a static method of MedicalSchool abstract class");
	}

}
