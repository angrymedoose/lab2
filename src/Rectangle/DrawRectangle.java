package Rectangle;

import java.awt.Graphics;
import java.awt.Point;

import Shapes.Draw;
import Shapes.Shape;
import Rectangle.Rectangle;

public class DrawRectangle implements Draw {

	@Override
	public void draw(Shape shape, Graphics g) {
		Rectangle rect = (Rectangle) shape;
		Point start = rect.getStartPoint();
		g.drawRect(start.x, start.y, rect.getWidth(), rect.getHeight());
	}
}
