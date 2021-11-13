package practicecollections;

import java.util.ArrayList;

public class ArrayListEg1 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Maruti");
		cars.add("volvo");
		cars.add("cars");
		cars.add("Mazda");
		for(int i=0; i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
	}
}
