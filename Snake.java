package chapter8Exersize;

import java.awt.*;

public class Snake extends Animals {
	private int size;
	
	public Snake(Point p, Graphics g) {
		super("Snake",p, 0, 0, 0, g);
		this.draw();
		this.size = 1;
	}
	public void move() {
		super.move("south", 1);
		this.draw();
		super.move("east", 1);
		this.draw();
		super.move("south",  1);
		this.draw();
		super.move("west", 2);
		this.draw();
		super.move("south",  1);
		this.draw();
		super.move("east", 3);
		this.draw();
		super.move("south", 1);
		this.draw();
		super.move("west", 4);
		this.draw();
			
	}
	public void draw() {
		Point p = super.getLocation();
		Graphics g = super.getGraphics();
		g.setColor(super.getColor());
		g.fillRect(p.x, p.y, size, size);
	}
	public String toString() {
		return "S";
	}

}
