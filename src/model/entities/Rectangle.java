package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape {
	
	public double width;
	public double heigth;
	
	public Rectangle(Color color, double width, double heigth) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public double area() {
		return width*heigth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
}
