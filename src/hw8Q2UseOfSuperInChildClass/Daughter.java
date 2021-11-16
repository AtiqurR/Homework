package hw8Q2UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

	public Daughter() {
		super("Ali", 60, 'M', false);
		super.father();
		super.fatherInfo("Islam", 55, 'M', true);
		super.FamilyName = "Rahman";
		System.out.println("FamilyName: " + FamilyName);
		System.out.println("This is a default constructor of daughter class\n");
	}

	public Daughter(String birthMonth, int age) {
		super();
		super.father();
		super.fatherInfo("Basit", 70, 'M', false);
		super.FamilyName = "Chowdhury";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("FamilyName: " + FamilyName);
		System.out.println("BirthMonth: " + birthMonth + "\nAge: " + age);
	}

	public void daughter() {
		super.father();
		super.fatherInfo("Kobir", 80, 'M', true);
		super.FamilyName = "Miah";
		System.out.println("FamilyName: " + FamilyName);
		System.out.println("This is a method of daughter class\n");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Bappy", 45, 'M', false);
		super.FamilyName = "Hossain";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("FamilyName: " + FamilyName);
		System.out.println("BirthMonth: " + birthMonth + "\nAge: " + age);

	}

}
