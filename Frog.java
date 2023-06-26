package chapter8Exersize;
import java.awt.*;

public class Frog extends RandomAnimals {
	private int steps;
	private int size;
	
	
	public Frog(Point p, Graphics g) {
		super("Frog", p, 120, 45, 7, g);
		this.steps = 1;
		this.size = 1;
		
		
	}
	public void draw() {
		// create a drawing of the frog thing
		Point p = super.getLocation();
		Graphics g = super.getGraphics();
		g.setColor(super.getColor());
		g.fillRect(p.x, p.y, size, size);
		
	}
	public void move() {
		super.move(1);
		this.draw();
		super.move(1);
		super.draw();
		super.move(1);
		super.draw();
	}
	public String toString() {
		return "F";
	}
}
