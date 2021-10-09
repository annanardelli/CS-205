package edu.monmouth.assignment1;

public class Main {

	public static void main(String[] args) {
		//for do while loop
		int count = 0;
		
		//Constants
		final int NUM_OF_ANIMALS = 5;
		final short MEANNESS = 6;
		
		//Object Creation
		Animal[] animals = new Animal[NUM_OF_ANIMALS];
		animals[0] = new Fish("blue");
		animals[1] = new GuardDog("brown", MEANNESS);
		animals[2] = new ShowDog("white", "poodle");
		animals[3] = new Dog("black");
		animals[4] = new Fish("yellow");
		
		//Enhanced For Loop
		System.out.println("Enhanced For Loop:");
		for (Animal animal : animals) {
			animal.move();
			animal.makeSound();
			System.out.println(animal.toString());
		}
		
		//For Loop
		System.out.println("\nNormal For Loop:");
		for (int i = 0; i < NUM_OF_ANIMALS; i++) {
			animals[i].move();
			animals[i].makeSound();
			System.out.println(animals[i].toString());
		}
		
		//Do while loop
		System.out.println("\nDo While Loop:");
		do {
			animals[count].move();
			animals[count].makeSound();
			System.out.println(animals[count].toString());
			count++;
		} while(count < NUM_OF_ANIMALS);
	}
}
