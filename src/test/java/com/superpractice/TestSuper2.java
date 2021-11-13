package com.superpractice;
class Person{
	int id;
	String name;
	Person(int id, String name){
		this.id = id;
		this.name = name;
	}
}
class Employee extends Person{
	float salary;
	Employee(int id, String name,float salary) {
		super(id, name);
		this.salary=salary;
	}
	void display() {
		System.out.println( id + " " + name + " " + salary);
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(54,"Rajveer",78000.0f);
		e1.display();
	}

}
