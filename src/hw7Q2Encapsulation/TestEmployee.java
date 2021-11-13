package hw7Q2Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpName("Tomas");
		employee.setEmpAge(40);
		employee.setSex('M');
		employee.setUsCitizen(true);
		
		System.out.println("Name:" +employee.getEmpName() + "\nAge:" + employee.getEmpAge() + "\nSex:" + employee.getSex() + "\nUsCitizen:"+ employee.isUsCitizen());
		

	}

	
}
