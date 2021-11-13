package hw7Q3Abstraction;

/* how many keywords are used for the inheritance in Interface?Ans =2 keywords
 * Can an interface inherit other Interfaces or a regular class or abstract class by extends key word?=Yes
 * How many inheritance is possible?Ans= as many as.
 */

public interface University extends College, Hospital {
	public abstract void classSize();

	public abstract void playGround();

	public abstract void teacher();

	// public University() { }
	// public interface University() {}
	// Interfaces cannot have constructors

	default void gymnasium() {
	} // default method

	static void library() { // static method

	}

}
