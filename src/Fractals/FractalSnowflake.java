package Fractals;
import processing.core.PApplet;



/**
  @(#)KochCurve.java
  @author Katia
  @version 5/31
*/
public class FractalSnowflake extends FractalCurve{
	
	private int mSides;
	private double mAngle;
	
    public FractalSnowflake(int level, int length, int sides) {
    	super(level, length);
    	mSides = sides;
    	mAngle = 360 / sides;
    }
    
    @Override
    public double[] draw(PApplet marker, double angle, double[] point) {
    	for (int i = 0; i < mSides; i++)
    		point = super.draw(marker, mAngle * i * -1, point);
    	return point;
    }

}