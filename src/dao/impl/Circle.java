package dao.impl;

import dao.Shape;

public class Circle implements Shape {
	private double radius;

	public void Area() {
		System.out.println(" 它的面积是：" + (3.14 * this.radius * this.radius));
	}

	public void Perimeter() {
		System.out.println(" 它的周长是：" + (2 * 3.14 * this.radius));
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		setRadius(radius);
	}
}
