package hw8Q2UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("............Default constructor of daughter class is initialized...........");
		Daughter daughter = new Daughter();
		System.out.println("............Paramitarized constructor of daughter class is initialized...........");
		Daughter daughter02 = new Daughter("January", 70);
		System.out.println("............Default method of daughter class is initialized...........");
		daughter.daughter();
		System.out.println("............Parametarized method of daughter class is initialized...........");
		daughter02.daughterInfo("March", 45);

	}

}
