package practice;

import java.util.HashSet;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Set;

public class BirdRepository {

	private static BirdRepository instance;
	Set<Bird> birdList = new HashSet<>();

	private BirdRepository() {

	}

	static synchronized BirdRepository getInstance() {
		if (instance == null) {
			instance = new BirdRepository();
		}
		return instance;
	}

	Set getBirdList() {
		return birdList;
	}

	public void add(Bird bird) {
		birdList.add(bird);
	}

	public void remove(Bird bird) {
		birdList.remove(bird);
	}

	Bird getBird(String id) {
		for (Bird bird : birdList) {
			if (bird.id.equals(id)) {
				System.out.println("Bird Found");
				return bird;
			}
		}
		System.out.println("Bird Not Found ...... ");
		return null;
	}
}
