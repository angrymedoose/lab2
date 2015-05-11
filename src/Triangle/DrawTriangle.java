package Triangle;

import java.awt.Graphics;
import java.awt.Point;

import Shapes.Draw;
import Shapes.Shape;


public class DrawTriangle implements Draw {


	@Override
	public void draw(Shape shape, Graphics g) {
		Triangle triangle = (Triangle) shape;
		Point start = triangle.getStartPoint();
		Point second = triangle.getSecondPoint();
		Point third = triangle.getThirdPoint();
		
		g.drawLine(start.x, start.y, second.x, second.y);
		g.drawLine(second.x, second.y, third.x, third.y);
		g.drawLine(start.x, start.y, third.x, third.y);
	}
}
