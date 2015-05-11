package Round;

import java.awt.Color;
import java.awt.Point;

import Shapes.Draw;
import Shapes.Factory;
import Shapes.Shape;

public class RoundFactory implements Factory{

	@Override
	public Shape getShape(Point start, Point finish, Color color) {
		int x, y, radius;
		x = (start.x + finish.x)/2;
		y = (start.y + finish.y)/2;
		radius = (start.x - finish.x)/2;
		if (radius < 0){
			radius *= (-1);
		}
		return new Round(x, y, radius,color);
	}

	@Override
	public Draw getDraw() {
		return new DrawRound();
	}

}
