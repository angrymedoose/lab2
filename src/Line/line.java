package Line;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import Shapes.Shape;

public class line extends Shape {
	protected int x2,y2;
	
	public line(int x, int y, int x2, int y2, Color color){
		super(x, y, color);
		this.x2 = x2;
		this.y2 = y2;
	}
	

	public Point getStartPoint(){
		return start;
	}
	
	public Point getEndPoint(){
		return new Point(x2, y2);
	}
	
	@Override
	public String getName() {
		
		return "Line";
	}

}
