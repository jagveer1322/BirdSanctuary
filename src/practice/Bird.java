package practice;

import java.util.Objects;

public class Bird {

	enum Color {
		RED, GREEN, WHITE, BLACK_WHITE, BLACK
	}

	String id;
	String name;
	Color color;
	boolean isFlyable;
	boolean isSwimmable;

	void eats() {
		System.out.println(getClass().getSimpleName() + "eats");
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Bird [id=" + id + ", name=" + name + ", color=" + color + ", isFlyable=" + isFlyable + ", isSwimmable="
				+ isSwimmable + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(id, other.id);
	}
}