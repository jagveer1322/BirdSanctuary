package practice;

import java.util.Set;
import java.util.Scanner;

public class UserInterface {

	int showMainMenu() {
		System.out.println("Select option \n 1 : Add Bird\n 2 : Remove Bird\n 3 : Edit Bird \n 4 : Print Bird\n " + MAINNEXT": exit");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;
	}

	public void print(Set birdList) {
		for (Object bird : birdList) {
			System.out.println(bird);
		}
	}

	void printFlyable(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			if (bird instanceof Flyable) {
				Flyable flyableBird = (Flyable) bird;
				flyableBird.fly();
			}
		}
	}

	void printSwimmable(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			if (bird instanceof Swimmable) {
				Swimmable swimmableBird = (Swimmable) bird;
				swimmableBird.swim();
			}
		}
	}

	void printEatable(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			bird.eat();
		}

	}

}
