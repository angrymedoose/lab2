package Rectangle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import Shapes.Shape;

public class Rectangle extends Shape {
	
	protected int width,height;
	
	public Rectangle(int x, int y, int width, int height, Color color){
		super(x, y, color);
		this.width = width;
		this.height = height;
	}

	
	public Point getStartPoint(){
		return start;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}

	@Override
	public String getName() {
		
		return "Rectangle";
	}

}
