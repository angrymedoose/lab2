package Ellipse;

import java.awt.Color;
import java.awt.Point;

import Ellipse.DrawEllipse;
import Ellipse.Ellipse;
import Shapes.Draw;
import Shapes.Shape;
import Shapes.Factory;

public class EllipseFactory implements Factory {

	
	@Override
	public Shape getShape(Point start, Point finish, Color color) {
		int x, y, x2, y2;
		x = start.x;
		y = start.y;
		x2 = finish.x - start.x;
		y2 = finish.y - start.y;

		if (x2 < 0){
			x2 *= (-1);
		}
		
		if (y2 < 0){
			y2 *= (-1);
		}
		
		return new Ellipse(x, y, x2, y2 ,color);
	}

	@Override
	public Draw getDraw() {
		return new DrawEllipse();
	}
}
