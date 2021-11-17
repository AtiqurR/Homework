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
		ColumbiaUniversity.columbiaUniversity();
		System.out.println("\n...........................****************.........................");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		College.studyRoom();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		Hospital.pharmacy();
		System.out.println("\n........................*************................................");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();
		MedicalSchool.medicalSchool();
		medicalSchool.statistics();
		medicalSchool.aeronauticalInfo();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		medicalSchool.physics();

	}

}
