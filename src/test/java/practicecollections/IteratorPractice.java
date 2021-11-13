package practicecollections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(13);
		numbers.add(15);
		numbers.add(40);
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(i<15) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
