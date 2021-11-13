package practicecollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNumbers {
 public static void main(String [] args) {
	 ArrayList<Integer> numbers = new ArrayList<Integer>();
	 numbers.add(12);
	 numbers.add(23);
	 numbers.add(244);
	 numbers.add(122);
	 numbers.add(23);
	 numbers.add(247);
	 Collections.sort(numbers);
	 for (int i :numbers) {
		 System.out.println(i);
	 }
	 
 }
}
