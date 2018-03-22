import java.util.Random;

public class MyGame {

	public static void main(String[] args) {
	
//	Create a two dimensional grid
		Position positions[][] = new Position[10][10];
		
//	Populate the grid with Position objects
		for (int y = 0; y < positions.length; y++ ) {
			for (int x = 0; x < positions[y].length; x++) {
				positions[x][y] = new Position(x+1,y+1);
			}
		}
		
//	Create a few resource boxes
		ResourceBox box1 = new ResourceBox(new Random().nextInt(10));
		ResourceBox box2 = new ResourceBox(new Random().nextInt(10));
		
//	Assign the boxes to positions
		positions[9][9].setResourceBox(box1);
	
//	Uncomment the following code to print the grid
//		for (int i = 0; i < positions.length ; i++) 
//			for (int j = 0; j < positions[i].length; j++)
//				System.out.println(positions[i][j]);

		 Creature human = new Creature(positions[0][0]);
		 System.out.println(human);
		
		 // Test our move() method
		 human.move(positions[9][9]);
		 System.out.println(human);
		 
		 // Test our eat() method
		 human.eat(18);
		 System.out.println(human);

	}

}
