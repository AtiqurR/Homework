package hw8Q3Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	default void dorm() {
	}

	static void studyRoom() {

	}

}
