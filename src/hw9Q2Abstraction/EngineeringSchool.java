package hw9Q2Abstraction;

public abstract class EngineeringSchool extends NYUniversity {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("I am trying to understand");

	}

	public EngineeringSchool() {
		System.out.println("Default constructor for Engineering School Class.\n");
	}

}
