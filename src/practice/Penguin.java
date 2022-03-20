package practice;

public class Penguin extends Bird implements Swimmable{

	public Penguin(String id) {
		this.id = id;
		this.name = "penguin";
		color = Color.BLACK_WHITE;
	}
	@Override
	public void swim() {
		System.out.println( "Penguin can swim");
	}

}
