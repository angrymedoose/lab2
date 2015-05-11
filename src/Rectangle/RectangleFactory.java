package Rectangle;

import java.awt.Color;
import java.awt.Point;

import Rectangle.DrawRectangle;
import Rectangle.Rectangle;
import Shapes.Draw;
import Shapes.Factory;
import Shapes.Shape;

public class RectangleFactory implements Factory {

	@Override
	public Shape getShape(Point start, Point finish, Color color) {
		int x, y, x2, y2;
		//x = start.x;
		//y = start.y;
		x2 = finish.x - start.x;
		y2 = finish.y - start.y;
		
		if (start.y > finish.y){
			y = finish.y;	
		}
		else
			y = start.y;
		
		if (start.x > finish.x){
			x = finish.x;	
		}
		else
			x = start.x;
		

		if (x2 < 0){
			x2 *= (-1);
		}
		
		if (y2 < 0){
			y2 *= (-1);
		}
		
		return new Rectangle(x, y, x2, y2 ,color);
	}

	@Override
	public Draw getDraw() {
		return new DrawRectangle();
	}
}
