package practice;

import java.util.HashSet;
import java.util.Set;

public class BirdRepository {
	// private List birdList = new ArrayList<>();
	private Set<Bird> birdList = new HashSet();

	Set getBirdList() {
		return birdList;
	}

	void add(Bird bird) {
		birdList.add(bird);
	}

	void remove(Bird bird) {
		birdList.remove(bird);
	}
}
