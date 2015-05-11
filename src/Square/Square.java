package Square;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import Shapes.Shape;

public class Square extends Shape {
	
	protected int size;
	
	public Square(int x, int y, int size, Color color){
		super(x, y, color);
		this.size = size;
	}
	
	
	public Point getStartPoint(){
		return start;
	}
	
	public int getSize(){
		return size;
	}
	
	@Override
	public String getName() {
		
		return "Square";
	}
}
