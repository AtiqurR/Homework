package hw3Q3Constructor;


public class Computer {
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;
	

	
	public Computer (){
		System.out.println("This is from default Constructor of Computer");
		
		
	}
	public Computer(String Brand, String Model, String OperatingSystem, int price, char grade,boolean madeInUsa) {
		this.Brand = Brand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;
		
		System.out.println("My Brand: "+ Brand +"\nModel: "+ Model+"\nOperatingSystem: "+ OperatingSystem+ "\nPrice: "+ price+"\nGrade: "+ grade+"\nMade in Usa?Ans: "+ madeInUsa);
		
	}
	
	public Computer(String Brand,int price,char grade) {
		this.Brand =Brand;
		this.price = price;
		this.grade = grade;
		
			}
	
	public Computer(String Brand,String OperatingSystem, int price, char grade, boolean madeInUsa) {
		this.Brand = Brand;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;
		
		
		
	}
	
}


