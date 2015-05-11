package Line;

import java.awt.Color;
import java.awt.Point;

import Round.DrawRound;
import Shapes.Draw;
import Shapes.Factory;
import Shapes.Shape;

public class LineFactory implements Factory {
	
	@Override
	public Shape getShape(Point start, Point finish, Color color) {
		int x, y, x2, y2;
		x = start.x;
		y = start.y;
		x2 = finish.x;
		y2 = finish.y;
		return new line(x, y, x2, y2 ,color);
	}

	@Override
	public Draw getDraw() {
		return new DrawLine();
	}

}
