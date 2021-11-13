package practicecollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice1 {
	public static void main(String[] args) {
		//in this program we store group of strings into HashSet and then retrieve the elements
		//one by one using an Iterator
		HashSet<String> hs = new HashSet<String>();
		hs.add("Narmada");
		hs.add("Ganga");
		hs.add("Kaveri");
		hs.add("Mandakini");
		hs.add("chambal");
		hs.add("Yamuna");
		
		System.out.println("Hash set = "+ hs);
		Iterator it = hs.iterator();
		
		System.out.println(" elements using iterator -");
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
	}

}
