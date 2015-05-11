package Ellipse;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import Shapes.Shape;

public class Ellipse extends Shape {
	
	protected int width, height;
	
	public Ellipse(int x, int y, int x2, int y2, Color color){
		super(x, y, color);
		this.width = x2;
		this.height = y2;
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
		
		return "Ellipse";
	}

}
