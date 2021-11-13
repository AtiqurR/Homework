package hw7Q2Encapsulation;

//a) Create a class, Employee. declare some
//private variables----> name, age, sex, usCitizen.
//How can you access those variables by getter and setter method? 
//Please execute those variables and print Employee info. Paste the GitHub link below.


public class Employee {
	
	private String empName;
	private int empAge;
	private char sex;
	private boolean usCitizen;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isUsCitizen() {
		return usCitizen;
	}
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}
	

}
