package dao.impl;

import dao.Shape;

public class Rect implements Shape {
	private int length;
	private int wide;

	public void Area() {
		System.out.println("它的面积是：" + (length * this.wide));
	}

	public void Perimeter() {
		System.out.println(" 它的周长是：" + ((this.length * 2) + (this.wide * 2)));
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}

	public Rect(int length, int wide) {
		setLength(length);
		setWide(wide);
	}
}
