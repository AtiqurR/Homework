package hw9Q2Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	default void dorm() {
	}

	public static void studyRoom() {

	}

}
