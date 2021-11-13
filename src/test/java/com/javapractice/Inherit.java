package com.javapractice;

class Shape{
	protected double l;
	Shape(double l){
		this.l =l;
	}
}
class Square extends Shape{
	
	Square(double l){
		super(l);
	}

void area() {
	System.out.println("area of square is - " + (l*l));
}
}

class Rectangle extends Square {
	private double y;
	
	Rectangle (double x,double y){
		super(x);
		this.y =y;
	}
	void area() {
		System.out.println("area of rectangle is : " + (l*y));
	}
}
public class Inherit {
public static void main(String[] args) {
	Square s = new Square(5.5);
	s.area();
	Rectangle r = new Rectangle(5.5,1.1);
	r.area();
	
}
}
