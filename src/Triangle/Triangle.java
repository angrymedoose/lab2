package Triangle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import Shapes.Shape;

public class Triangle extends Shape {
	
	protected int x2,y2,x3,y3;
	
	public Triangle(int x, int y, int x2, int y2, int x3, int y3, Color color){
		super(x, y, color);
		this.x2 = x2;
		this.x3 = x3;
		this.y2 = y2;
		this.y3 = y3;
	}
	
	public Point getStartPoint(){
		return start;
	}
	
	public Point getSecondPoint(){
		return new Point(x2, y2);
	}
	
	public Point getThirdPoint(){
		return new Point(x3, y3);
	}
	
	@Override
	public String getName() {
		
		return "Triangle";
	}

}
