package Shapes;

import java.awt.Color;
import java.awt.Point;

public interface Factory {

	public Shape getShape(Point start, Point finish, Color color);
	
	public Draw getDraw();
}
