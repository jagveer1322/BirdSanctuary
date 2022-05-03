package practice;

import java.util.Scanner;

import practice.Bird.Color;

public class Main {
	final static int MAIN_EXIT = 7;
	final static int UPDATE_MENU_EXIT = 5;

	void handleUserOption(int selectedOptionIs) {
		BirdRepository birdRepository = BirdRepository.getInstance();
		UserInterface userInterface = UserInterface.getInstance();
		Scanner scanner = new Scanner(System.in);

		switch (selectedOptionIs) {
		case 1:
			addBird();
			System.out.println("Birds are added");
			break;
		case 2:
			System.out.println("Enter the bird id of the bird which you want to remove ?");

			String id = scanner.nextLine();
			Bird removeBird = birdRepository.getBird(id);
			birdRepository.remove(removeBird);
			System.out.println("enter bird id will remove");
			break;
		case 3:
			System.out.println("Enter the bird Id which you want to edit");
			String id2 = scanner.nextLine();
			Bird bird = birdRepository.getBird(id2);
			int option1 = userInterface.showUpdateMenu();
			do {
				handleUpdateUserSelection(option1, bird);
			} while (option1 != UPDATE_MENU_EXIT);
			break;
		case 4:
			if (birdRepository.birdList.size() != 0) {

				System.out.println("\n *****Here is the updated Bird Set***** \n");
				userInterface.print(birdRepository.getBirdList());
			} else {
				System.out.println("Oops...As of now, Bird set is empty....");
			}
			break;
		case 5:
			System.out.println("Birds are Flyable");
			userInterface.printFlyable(birdRepository.getBirdList());
			break;
		case 6:
			System.out.println("Birds are swimmable");
			userInterface.printSwmmable(birdRepository.getBirdList());
			break;
		case MAIN_EXIT:
			System.out.println("Good Bye!");
			break;
		default:
			System.out.println("Enter correct choice");

		}
	}

	private void handleUpdateUserSelection(int option1, Bird bird) {
		BirdRepository birdRepository = BirdRepository.getInstance();
		Scanner scanner = new Scanner(System.in);

		switch (option1) {

		case 1:
			System.out.println("enter the bird id");
			String newID = scanner.nextLine();
			bird.id = newID;
			break;
		case 2:
			System.out.println("enter the bird name");
			String newName = scanner.nextLine();
			bird.name = newName;
			break;
		case 3:
			setColor(bird);
			break;
		case UPDATE_MENU_EXIT:
			break;

		default:
			System.out.println("enter correct choice");

		}

	}

	private void setColor(Bird editedBird) {
		System.out.println("Enter options \n 1-- Black \n 2--Black_White\n 3--Green \n 4--Red\n 5-- White");
		Scanner scanner = new Scanner(System.in);
		int selectedOptionForColor = scanner.nextInt();
		switch (selectedOptionForColor) {
		case 1:
			editedBird.color = Color.BLACK;
			System.out.println("Color was edited Sucessfully:)");
			System.out.println(editedBird);
			break;
		case 2:
			editedBird.color = Color.BLACK_WHITE;
			System.out.println("Color was edited Sucessfully:)");
			System.out.println(editedBird);
			break;
		case 3:
			editedBird.color = Color.GREEN;
			System.out.println("Color was edited Sucessfully:)");
			System.out.println(editedBird);
			break;
		case 4:
			editedBird.color = Color.RED;
			System.out.println("Color was edited Sucessfully:)");
			System.out.println(editedBird);
			break;
		case 5:
			editedBird.color = Color.WHITE;
			System.out.println("Color was edited Sucessfully:)");
			System.out.println(editedBird);
			break;
		default:
			System.out.println("Kindly Select valid color...");
			break;
		}
	}

	private void addBird() {
		BirdRepository birdRepository = BirdRepository.getInstance();
		System.out.println("Enter Name of Bird");
		Scanner scanner = new Scanner(System.in);
		Bird bird = new Bird();
		bird.name = scanner.nextLine();
		System.out.println("Enter Bird ID");
		bird.id = scanner.nextLine();
		System.out.println("Select Bird of Color");
		setColor(bird);
		System.out.println("Bird is Flyable");
		bird.isFlyable = scanner.nextBoolean();
		System.out.println("Bird is Swimmable");
		bird.isSwimmable = scanner.nextBoolean();
		birdRepository.add(bird);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to bird Sanctuary...");
		System.out.println(" ");
		UserInterface userInterface = UserInterface.getInstance();
		Main main = new Main();
		int selectedOptionIs;
		do {
			selectedOptionIs = userInterface.showMainMenu();
			main.handleUserOption(selectedOptionIs);
		} while (selectedOptionIs != MAIN_EXIT);
	}
}