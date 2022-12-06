package Fractals;

import java.awt.event.KeyEvent;

import processing.core.PApplet;
import processing.event.MouseEvent;


public class DrawingSurface extends PApplet {

	private KochSnowflake snowflake;
	private int level, length;
	
	public DrawingSurface() {
		level = 0;
		length = 100;
		snowflake = new KochSnowflake(level,length, 3);
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {}
	
	// The statements in draw() are executed until the 
	// program is stopped. Each statement is executed in 
	// sequence and after the last line is read, the first 
	// line is executed again.
	public void draw() { 
		background(255);   // Clear the screen with a white background
		
		textSize(12);
		fill(0);
		text("Use the mouse wheel to change length, use UP/DOWN keys to change level.",0,15);
		
		stroke(0);
		snowflake.draw(this, 0, new double[] {150, 150});		
	}
	
	
	public void mouseWheel(MouseEvent event) {
		  int num = event.getCount();
		  length -= num*10;
		  snowflake = new KochSnowflake(level,length, 3);
	}
	
	public void keyPressed() {
		if (keyCode == KeyEvent.VK_UP) {
			level++;
			snowflake = new KochSnowflake(level,length, 3);
		} else if (keyCode == KeyEvent.VK_DOWN) {
			level--;
			snowflake = new KochSnowflake(level,length, 3);
		}
	}
	
}