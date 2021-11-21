package hw9Q2Abstraction;

public abstract class NursingSchool extends RockefellerUniversity {

	public abstract void hygiene();

	public void caring() {
		System.out.println("We should take care of our parents.\n");
	}

	public NursingSchool() {

		System.out.println("This is the default constructor for Nursing School Class.\n");
	}
}
