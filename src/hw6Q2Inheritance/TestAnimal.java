package hw6Q2Inheritance;

import hw6Q3Abstraction.University;

public class TestAnimal {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n");

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n");

		BullDog bullDog = new BullDog(); // This one is multilevel inheritance
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n");

		Cobra cobra = new Cobra(); // This one is multilevel inheritance
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		System.out.println("\n");

		Dog dog = new Dog();
		dog.dogInfo();
		dog.animalInfo();

		System.out.println("\n");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo(); // single inheritance

		System.out.println("\n");

		Robin robin = new Robin(); // This one is Hierarchical inheritance
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("\n");

		Snake snake = new Snake(); // This one is Hierarchical inheritance
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

	}

}
