package hw9Q2Abstraction;

/* how many keywords are used for the inheritance in Interface?Ans =1 keyword
 * Can an interface inherit other Interfaces?Ans: Yes or an interface inherit regular class or abstract class by extends key word?=No
 * How many inheritance is possible?Ans= more than one.
 */

public interface University extends College, Hospital {
	public abstract void classSize();

	public abstract void playGround();

	public abstract void teacher();

	// public University() { }
	// public interface University() {}
	// Interfaces cannot have constructors

	public default void gymnasium() { // default method
		System.out.println("This is a default type method");

	}

	public static void library() { // static method
		System.out.println("This is a static method");

	}

}
