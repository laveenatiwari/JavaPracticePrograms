package com.runtimePolymorphism;

public class BikeEg {
	void run() {
		System.out.println("run method in Bike Class");
	}
}
class Splendor extends BikeEg{
	void run() {
		System.out.println("run method in Splendor Class");
	}
	public static void main(String[] args) {
		BikeEg b = new Splendor();
		b.run();
	}
}
