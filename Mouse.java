package chapter8Exersize;
import java.awt.* ;

public class Mouse extends Animals {
	private int size;
	
	public Mouse(Point p, Graphics g) {
		super("Mouse", p, 160, 50, 50, g);
		this.size = 6;
		
	}
	public void move() {
		super.move(-1, -1);
		System.out.println("Moved to here: "+ super.getLocation());
		
	}
	public void draw() {
		Point p = super.getLocation();
		Graphics g = super.getGraphics();
		g.setColor(super.getColor());
		g.fillRect(p.x, p.y, size, size);
	}
	public String toString() {
		return "M";
	}
	

}
