
public class ResourceBox {
	private int numberOfFoodItems;
	
	public ResourceBox(int food) {
		numberOfFoodItems = food;
	}
	
	@Override
	public String toString() {
		return "ResourceBox [numberOfFoodItems=" + numberOfFoodItems + "]";
	}
}
