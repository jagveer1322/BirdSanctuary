package practice;

import java.util.Scanner;
//import java.util.List;
import java.util.Set;

public class UserInterface {
	private static UserInterface instance;
	Scanner scanner = new Scanner(System.in);

	private UserInterface() {

	}

	static synchronized UserInterface getInstance() {
		if (instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}

	int showMainMenu() {
		System.out.println("Select options \n\n1. Add the birds\n2. Remove the birds\n"
				+ "3. Edit the bird list\n4. Printing the birds\n5 : flyable Birds\n6 : Swimmable Birds\n"
				+ Main.MAIN_EXIT + ". Exit");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		scanner.close();
		return option;
	}

	int showUpdateMenu() {
		System.out.println("Enter which field you would like to update .." + "1. id" + "2. name" + "3. color");
		int option2 = scanner.nextInt();
		return option2;
	}

	void print(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			System.out.println(bird);
		}
	}

	void printFlyable(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			if (bird.isFlyable) {
				System.out.println(bird.name + " can fly");

			}
		}
	}

	void printSwmmable(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			if (bird.isSwimmable) {
				System.out.println(bird.name + " can swim");
			}
		}
	}
}
