package Round;

import java.awt.Graphics;
import java.awt.Point;

import Shapes.Draw;
import Shapes.Shape;

public class DrawRound implements Draw{

	@Override
	public void draw(Shape shape, Graphics g) {
		Round round = (Round) shape;
		Point start = round.getStartPoint();
		g.drawOval(start.x, start.y, round.getRadius(), round.getRadius());
	}

}
