package Fractals;

public class FractalCurve {

	private int mLevel, mLength;
	
    public FractalCurve(int level, int length) {
    	mLevel = level;
    	mLength = length;
    }
    
    public double[] draw(PApplet marker, double angle, double[] point) {
    	return drawKochCurve(marker, mLevel, mLength, angle, point);
    }

    private double[] drawKochCurve(PApplet marker, int level, 
    		double length, double angle, double[] point) {
    	
    	if (level < 1) {
    		double angleInRad = angle * (Math.PI / 180);
    		double[] newPoint = new double[] {
    				point[0] + (length * Math.cos(angleInRad)),
    				point[1] + (length * Math.sin(angleInRad))};
    		
    		// Draw a straight line of the current length
    		marker.line((float) point[0], (float) point[1], 
    				(float) newPoint[0], (float) newPoint[1]);
    		
    		return newPoint;
    	} else {
    		// k-1 level Koch curve, 1/3 the current length
    		point = drawKochCurve(marker, level - 1, length/3, angle, point);
    		
			// Start prevPoint, k-1 level Koch curve, 1/3 the current length, 60 degrees w/rspt to current angle
    		point = drawKochCurve(marker, level - 1, length/3, angle + 60, point);
    		
    		// Start prevPoint, k-1 level Koch curve, 1/3 the current length, -60 degrees w/rspt to current angle
    		point = drawKochCurve(marker, level - 1, length/3, angle - 60, point);
						
    		// Start prevPoint, k-1 level Koch curve, 1/3 the current length
    		point = drawKochCurve(marker, level - 1, length/3, angle, point);
    		
    		return point;
    	}
    }

}