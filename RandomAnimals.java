package chapter8Exersize;
import java.util.Random;

import java.awt.*;

public abstract class RandomAnimals extends Animals {
	
	
	public RandomAnimals(String name, Point p, int red, int green, int blue, Graphics g) {
		super(name, p, red, green, blue, g);		
	}
	public void move(int steps) {
		// randomly move a certain number of steps in a random direction
		Point p = super.getLocation();
		Random rand = new Random();
		int x = p.x;
		int y = p.y;
		
		// moving x or y and if we are going negative or positive
		if (rand.nextInt() > 5) {
			x += steps;
			if (rand.nextInt() > 5) { // Negative result
				x -= (2 * steps);
		}
		}else {
			y += steps;
			
			if (rand.nextInt()> 5) { // Negative result
				y -= (2 * steps);
			}		
		}
		p.setLocation(x , y);
		p = super.correctPoint(p);
		super.setLocation(p);
	}
	public void draw() {
		// another abstract class for subclasses to create
	}
		
}
