package practice;

public class Main {
	final int MAINNEXT = 5;

	void handleUserSelection(int option) {
		switch (option) {
		case 1:{
			
			break;
		}

		case 2:{
			
			break;
			
		}

		case 3:{
			
			break;
			
		}
		
		case 4:{
			break;
			
		}
		case MAINNEXT :{
			
			break;
			
		}
		default :
		{
			System.out.println("Choose correct Option");
		}

		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome To Bird Sanctuary");
		UserInterface ui = new UserInterface();
		Main main = new Main();
		int option ;
		do {
			
		 option = ui.showMainMenu();
		main.handleUserSelection(option);
		}while(option == 5);

//		Bird penguin = new Penguin("P001");
//		Bird parrot = new Parrot("P001");
//		Bird peacock = new Peacock("P001");
//		Bird ostrich = new Ostrich("O001");
//		Bird duck = new Duck("D001");
//
//		BirdRepository birdrepo = new BirdRepository();
//
//		birdrepo.add(penguin);
//		birdrepo.add(parrot);
//		birdrepo.add(duck);
//		birdrepo.add(peacock);
//		birdrepo.add(ostrich);
//
//		UserInterface u1 = new UserInterface();
//
//		u1.print(birdrepo.getBirdList());
//		birdrepo.remove(parrot);
//		System.out.println("-------------------------------------------------------");
//		System.out.println("birds after removing");
//		u1.print(birdrepo.getBirdList());

	}
}
