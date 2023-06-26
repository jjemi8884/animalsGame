package chapter8Exersize;

import java.awt.Graphics;
import java.awt.Point;

public class Rabbit extends Animals {
	private int size;
	
	public Rabbit(Point p, Graphics g) {
		super("Rabbit", p, 45, 180, 0, g);
		this.size = 10;
	}
	public void draw() {
		Point p = super.getLocation();
		Graphics g = super.getGraphics();
		g.setColor(super.getColor());
		g.fillRect(p.x, p.y, size, size);
	}
	public void move() {
		super.move(0, 1);
		super.move(1, 0);
		super.move(0, -1);
	}
	public String toString() {
		return "R";
	}
	

}
