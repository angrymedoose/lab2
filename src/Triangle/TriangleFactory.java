package Triangle;

import java.awt.Color;
import java.awt.Point;


import Triangle.DrawTriangle;
import Triangle.Triangle;
import Shapes.Draw;
import Shapes.Shape;
import Shapes.Factory;

public class TriangleFactory implements Factory {
	
	@Override
	public Shape getShape(Point start, Point finish, Color color) {
		int x, y, x2, y2, x3, y3;
		x = start.x;
		y = start.y;
		x2 = finish.x;
		y2 = finish.y;
		y3 = start.y;
		
		if (x > x2) {
			x3 = x2 - (x - x2);
		}
		else {
			x3 = x2 + (x2 - x);
		}

		
		return new Triangle(x, y, x2, y2, x3, y3, color);
	}

	@Override
	public Draw getDraw() {
		return new DrawTriangle();
	}
}
