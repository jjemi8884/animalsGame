package chapter8Exersize;
import java.awt.* ;

public class Bird extends RandomAnimals{
	// the class for birds
	private int size;
	private int steps;
	
	
	
	
	public Bird (Point p, Graphics g) {
		super("Bird",p, 7, 66, 120, g);
		this.size = 20;
		this.steps = 1;
		
		// set the location of the bird
		this.draw();
	}
	public void draw() {
		Point p = super.getLocation();
		Graphics g = super.getGraphics();
		g.setColor(super.getColor());
		g.fillRect(p.x, p.y, size, size);
		
		
	}
	public void move() {
		super.move(this.steps);
		
	}
	public String toString() {
		return "B";
	}
}
