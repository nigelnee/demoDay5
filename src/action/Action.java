package action;

import dao.Shape;
import dao.impl.Circle;
import dao.impl.Rect;

public class Action {
	public static void main(String[] args) {
		Shape[] Shape = new Shape[2];
		Rect a = new Rect(2, 3);
		Circle b = new Circle(3);
		Shape[0] = a;
		Shape[1] = b;
		for (int i = 0; i < 2; i++) {
			Shape[i].Perimeter();
			Shape[i].Area();
		}
	}

}
