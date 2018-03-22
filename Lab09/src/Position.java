
public class Position {
	private int x;
	private int y;
	private ResourceBox resourceBox;
	private boolean available;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
		resourceBox = null;
		available = true;
	}

	public boolean isEmpty() {
		return available;
	}
	
	

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + ", resourceBox=" + resourceBox + ", available=" + available + "]";
	}

	public int effortTo(Position position) {
		return Math.abs(this.x - position.x) + Math.abs(this.y - position.y);
	}
	
	public void setResourceBox(ResourceBox box) {
		resourceBox = box;
	}
	
	public ResourceBox getResourceBox() {
		return resourceBox;
	}
}
