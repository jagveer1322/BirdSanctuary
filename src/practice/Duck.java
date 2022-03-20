package practice;

public class Duck extends Bird implements Flyable, Swimmable {
	public Duck(String id) {

		this.id = id;
		this.name = "Duck";
		color = Color.WHITE;
	}

	@Override
	public void fly() {
		System.out.println("Duck can fly");

	}
	@Override
	public void swim() {
		System.out.println("Duck can swim");

	}


}
