package Line;

import java.awt.Graphics;
import java.awt.Point;

import Shapes.Draw;
import Shapes.Shape;

public class DrawLine implements Draw {
	
	@Override
	public void draw(Shape shape, Graphics g) {
		line Line = (line) shape;
		Point start = Line.getStartPoint();
		Point end = Line.getEndPoint();
		g.drawLine(start.x, start.y, end.x, end.y);
	}

}
