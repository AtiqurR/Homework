package hw9Q2Abstraction;

public interface College {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	// public College () {
	// System.err.println("");
	// }
	// We cannot create a constructor inside the interface because the interface
	// cannot be instantiate.

	public default void dorm() {
		System.out.println("Dorm method is from College Interface.");

	}

	public static void studyRoom() {
		System.out.println("StudyRoom method is from College Interface.");

	}

}
