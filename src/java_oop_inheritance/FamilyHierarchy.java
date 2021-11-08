package java_oop_inheritance;

public class FamilyHierarchy {

	public static void main(String[] args) {
		GrandFather grandFather = new GrandFather();
		grandFather.grandFatherInfo();

		Father father = new Father();
		father.fatherInfo();

		MySelf mySelf = new MySelf();
		mySelf.myInfo();
		Son son = new Son();
		son.sonInfo();

		Sister sister = new Sister();
		sister.sisterInfo();
		Niece niece = new Niece();
		niece.nieceInfo();
		GrandChild grandChild = new GrandChild();
		grandChild.grandChildInfo();

		Uncle uncle = new Uncle();
		uncle.uncleInfo();
		Cousin02 cousin02 = new Cousin02();
		cousin02.cousin02Info();

		Aunt aunt = new Aunt();
		aunt.auntInfo();
		Cousin01 cousin01 = new Cousin01();
		cousin01.cousin01Info();

	}

}
