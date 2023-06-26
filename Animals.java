package chapter8Exersize;

import java.awt.*;

public class Animals {
	
	private Point p;
	private String name;
	private Color c;
	private Graphics g;
	
	public Animals (String animalName, Point p, int red, int green, int blue, Graphics g) {
		this.p = p;
		this.name = animalName;
		this.c = new Color(red, green, blue);
		this.g = g;
		
	}
	
	public void move(String direction, int steps) {
		// move in the x and y locations
		int x = p.x;
		int y = p.y;
		if (direction.equals("north")) {
			y -= steps;
		}else if (direction.equals("south")) {
			y += steps; 
		}else if (direction.equals("east")) {
			x += steps;
		}else if (direction.equals("west")) {
			x -= steps;
		}else {
			System.out.println("Move for " + this.name + " is messed up");
		}
		this.p.setLocation(x,y);
		
		
	}
	public void draw(Graphics g) {
		// abstract method for the size of the animal that has to be individual
	}
	
	// these should be the same in all classes
	public Point getLocation () {
		return this.p;
	}
	public Graphics getGraphics() {
		return g;
	}
	public Color getColor() {
		return c;
	}
	public void setLocation(Point p) {
		this.p = p;
	}
	public String getName() {
		return this.name;
	}
	public Point correctPoint(Point p) {
		// will mat the point move the other side of the screen
		int x = p.x;
		int y = p.y;
		// check x first
			x = coorCheck(x);
		//check y now
			y = coorCheck(y);
		p.setLocation(x, y);
		return p;
		}
	
	// methods used internally not for external use!!
	private int coorCheck(int x) {
	if (x < 0) {
		return 400 + x;
	}else if (x > 400) {
		return x - 400;
	}else {
		return x; // no change needed
	}
	}
}
