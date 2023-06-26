package chapter8Exersize;

import java.awt.Graphics;
import java.awt.Point;

public class Rabbit extends Animals {
	private int size;
	
	public Rabbit(Point p, Graphics g) {
		super("Rabbit", p, 45, 180, 0, g);
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
		super.move("north", 2);
		this.draw();
		super.move("east", 2);
		this.draw();
		super.move("south", 2);
		this.draw();
	}
	public String toString() {
		return "R";
	}
	

}
