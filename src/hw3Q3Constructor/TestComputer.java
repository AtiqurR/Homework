package hw3Q3Constructor;

public class TestComputer {

	public static void main(String[] args) {

		Computer computer = new Computer(); // default Constructor initialize
		Computer computer1 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'C', false);

		System.out.println("*************************************");

		Computer computer2 = new Computer("Windows", "Lenovo Flex 5", "Windows 11", 850, 'D', true);

		Computer computer3 = new Computer("TR", 58585, 'A');

		Computer computer4 = new Computer("AR", "QA Java", 5000, 'X', true);

	}

}
