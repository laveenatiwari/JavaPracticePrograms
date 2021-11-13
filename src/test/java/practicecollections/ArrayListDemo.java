package practicecollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> sl = new ArrayList<String>();
		sl.add("UK");
		sl.add("Northern Ireland");
		sl.add("Wales");
		sl.add("Scotland");
		sl.add("france");
		sl.add("portugal");
		sl.add("luxemburg");
		sl.add("spain");
		
		System.out.println(" contents of array list are -" + sl);
		
		sl.remove(5);
		sl.remove("luxemburg");
		
		System.out.println(" displaying contents of list after removing some objects " + sl);
		
		System.out.println(" size of array list is - " + sl.size());
		
		System.out.println(" extracting using iterator - ");
		
		Iterator it = sl.iterator();
		while(it.hasNext()) {
			System.out.println("printing elements using iteratr - " + it.next());
		}
	}

}
