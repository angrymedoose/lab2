package Round;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import Shapes.Shape;


public class Round extends Shape{

	protected int radius;
	
	public Round(int x, int y, int radius, Color color){
		super(x, y, color);
		this.radius = radius;
	}
	

	
	public Point getStartPoint(){
		return start;
	}
	
	public int getRadius(){
		return radius;
	}

	@Override
	public String getName() {
		
		return "Round";
	}
}