package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Shape {
    
	protected int x, y;
	protected Point start;
	protected Color color;
	
	public Shape(int x, int y, Color color){
		this.x = x;
		this.y = y;
		start = new Point(x, y);
		this.color = color;
	}
		
	public abstract String getName();
	
}
