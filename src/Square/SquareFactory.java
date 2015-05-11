package Square;

import java.awt.Color;
import java.awt.Point;

import Square.DrawSquare;
import Square.Square;
import Shapes.Draw;
import Shapes.Shape;
import Shapes.Factory;

public class SquareFactory implements Factory{
	
	@Override
	public Shape getShape(Point start, Point finish, Color color) {
		int x, y, size;
		
		size = finish.x - start.x;	
		if (size==0){
			size = finish.y - start.y;
		}
		
		if (size < 0){
			size *= (-1);
		}
		
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
		
		return new Square(x, y, size ,color);
	}

	@Override
	public Draw getDraw() {
		return new DrawSquare();
	}

}
