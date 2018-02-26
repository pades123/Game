//Do not change this file
public class OrderProgram {

	public static void main(String[] args) {
		Order o =  new Order();
		
		Product p1 = new Product("potatoes", 2.50);
		Product p2 = new Product("spaghetti", 5.00);
		Product p3 = new Product("hamburger", 4.20);
		Product p4 = new Product("ceasar's", 4.80);
		
		o.add(p1, 3);
		o.add(p2, 2);
		o.add(p3, 2);
		o.add(p4, 5);

		o.printReceipt();
	}

}
