package practice;

public class Peacock extends Bird implements Flyable {
	public Peacock(String id) {
		this.id = id;
		this.name = "Peacock";
		color = Color.BLACK;
	}
	
	@Override
	public void fly() {
		System.out.println("Peacock can fly");
	}

}
