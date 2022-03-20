package practice;

public class Parrot extends Bird implements Flyable{
	
	public Parrot(String id) {
		this.id = id;
		this.name = "Parrot";
		color = Color.GREEN;
	}

	@Override
	public void fly() {
		System.out.println("Parrot can fly");

	}
	

}
