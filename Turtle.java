package chapter8Exersize;
import java.awt.*;

public class Turtle extends Animals {
	private int size;
	
	public Turtle(Point p, Graphics g) {
		super("Turtel", p, 60, 160, 255, g);
		this.size = 1;
		this.draw();
	}
	public void draw() {
		Point p = super.getLocation();
		Graphics g = super.getGraphics();
		g.setColor(super.getColor());
		g.fillRect(p.x, p.y, size, size);
	}
	public void move() {
		super.move("south", 5);
		super.move("west", 5);
		super.move("north", 5);
		super.move("east", 5);
	}
	public String toString() {
		return "T";
	}

}
