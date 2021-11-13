package com.superpractice;

class Animal{
	String color ="white";
	void eat() {
		System.out.println("eat method in Animal class");
	}
	Animal(){
		System.out.println("this is animal class default constructor");	}
}
class Dog extends Animal{
	Dog(){
		super();
		System.out.println("default constructor of Dog class");
	}
	String color ="black";
	void printColor() {
		System.out.println("print color of dog as - " +color);
		System.out.println("print color of Animal using super keyword " + super.color);
		//super keyword refers to parent class instance variable when parent and chil class have same fields
	}
	void eat() {
		System.out.println("eat method in Dog class");
		super.eat();
	}
}
public class TestSuper1 {
	public static void main(String[] args) {
		Dog dg= new Dog();
		dg.printColor();
		dg.eat();
	}
}
