package Square;

import java.awt.Graphics;
import java.awt.Point;

import Line.line;
import Shapes.Draw;
import Shapes.Shape;

public class DrawSquare implements Draw {

	@Override
	public void draw(Shape shape, Graphics g) {
		Square square = (Square) shape;
		Point start = square.getStartPoint();
		g.drawRect(start.x, start.y, square.getSize(), square.getSize());
	}
}
