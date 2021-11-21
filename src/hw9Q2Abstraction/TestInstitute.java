package hw9Q2Abstraction;

public class TestInstitute {

	public static void main(String[] arg) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.lawInfo();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.hygiene();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.gymnasium();
		columbiaUniversity.dorm();
		columbiaUniversity.morgue();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.caring();
		columbiaUniversity.statistics();
		columbiaUniversity.computerLab();
		columbiaUniversity.physics();
		ColumbiaUniversity.columbiaUniversity(); // I called here static method of ColumbiaUniversity class

		System.out.println("\n...........................****************.........................\n");

		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library(); // I called here static method of University Interface
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();

		System.out.println("\n........................*************................................\n");

		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();
		MedicalSchool.medicalSchool(); // I called here static method of MedicalSchool abstract class
		medicalSchool.statistics();
		medicalSchool.aeronauticalInfo();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		medicalSchool.physics();

	}

}
