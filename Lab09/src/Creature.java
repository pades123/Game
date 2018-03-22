
public class Creature {
	private int strength;
	private int health;
	private Position position;
	private ResourceBox resourceBox;
	private final int MAXSTRENGTH = 100;

	public Creature() {
		strength = 100;
		position = null;
	}

	public Creature(Position position) {
		strength = 100;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Creature [strength=" + strength + ", position=" + position + "]";
	}
	
	public void collectResourceBox(ResourceBox box) {
		resourceBox = box;
	}
	
	public void dropResourceBox() {
		resourceBox = null;
	}

	public void eat(int amountOfFood) {
		for (int i = 0; i < amountOfFood; i++) {
			if (strength < MAXSTRENGTH) {
				strength++;
			}
		}
	}

	public void move(Position position) {
		if (position.isEmpty() && strength > this.position.effortTo(position)) {
			strength -= this.position.effortTo(position);
			this.position = position;
		}
	}
}
