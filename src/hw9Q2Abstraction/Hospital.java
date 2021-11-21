package hw9Q2Abstraction;

public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("Morgue method is from Hospital Interface.");

	}

	public static void pharmacy() {

		System.out.println("Pharmacy method is from Hospital Interface.");
	}

}
