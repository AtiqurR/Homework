package hw9Q2Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	// if we want to make a abstract method in regular class we need to make the
	// class to abstract
	// public abstract void maths();
	// We cannot declare abstract method in regular class we can only implement non
	// abstract method here.

	public void statistics() {
		System.out.println("This is a very good University");
	}

	public RockefellerUniversity() {

		System.out.println(" Default constructor for Rockefeller University Class.\n");

	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("This method is from  AeronauticalSchool interface");

	}

	@Override
	public void mechanicalLab() {
		System.out.println("This method is from EngineeringSchool abstract class");

	}
}
