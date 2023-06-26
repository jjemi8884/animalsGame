package chapter8Exersize;
import java.awt.*;
import java.util.Random;

public class AnimalsMain {
	public static void main(String [] args) {
		
	
	// create the drawing panel
	int size = 400;
	DrawingPanel panel = new DrawingPanel(size, size);
	Graphics g = panel.getGraphics();
	// initialize the animals in random locations.
	Random rand = new Random();
	
	
	Bird b = new Bird(new Point(rand.nextInt(size), rand.nextInt(size)), g);
	Frog f = new Frog(new Point(rand.nextInt(size), rand.nextInt(size)), g);
	Mouse m = new Mouse(new Point(rand.nextInt(size), rand.nextInt(size)), g);
	for(int i = 0; i < 10; i++) {
		b.move();
		b.draw();
		f.move();
		f.draw();
		m.move();
		m.draw();
	}
	 
	}

}
