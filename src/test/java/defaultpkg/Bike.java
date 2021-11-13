package defaultpkg;

class Vehicle{ 
	void run() {
		System.out.println("vehicle is running");
	}
}
public class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is running safely"); //method overriding, IS-A relationship
	}
public static void main(String[] args) {
	Bike bj = new Bike();
	bj.run(); //method overriding. calling method of parent class by using child class instance 
}
	
}
