package Ellipse;

import java.awt.Graphics;
import java.awt.Point;

import Shapes.Draw;
import Shapes.Shape;
import Square.Square;

public class DrawEllipse implements Draw {

	@Override
	public void draw(Shape shape, Graphics g) {
		Ellipse ellipse = (Ellipse) shape;
		Point start = ellipse.getStartPoint();
		g.drawOval(start.x, start.y, ellipse.getWidth(), ellipse.getHeight());
	}
}
