package hw8Q2UseOfSuperInChildClass;

public class Father {
	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;

	public Father() {
		System.out.println("This is a default constructor of Father class");

	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nUs Citizen: " + usCitizen);

	}

	public void father() {
		System.out.println("This is a void type method of Father class");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nUs Citizen: " + usCitizen);

	}
}
