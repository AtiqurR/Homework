package hw3Q2variableAndMethod;

public class TestComputer {

	public static void main(String[] args) {
		Computer computer = new Computer(); // Constructor initialized
		computer.Brand = "Apple";
		computer.Model = "MacBook Air";
		computer.OperatingSystem = "MacOS Mojava";
		computer.price = 800;
		computer.grade = 'C';
		computer.madeInUsa = false;
		computer.configuration(); // method initialized

		System.out.println("********************************");

		Computer computer2 = new Computer();
		computer2.Brand = "Windows";
		computer2.Model = "Lenovo Flex 5";
		computer2.OperatingSystem = "Windows 10";
		computer2.price = 850;
		computer2.grade = 'D';
		computer2.madeInUsa = true;
		computer2.configuration(); // method initialized

	}

}
