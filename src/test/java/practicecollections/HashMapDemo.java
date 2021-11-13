package practicecollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//declare HashMap
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//adding elements to HashMap
		hm.put(12,"Rahul");
		hm.put(13, "Prashant");
		hm.put(14, "Rohit");
		hm.put(15, "Paul");

		for(Map.Entry<Integer, String> mu : hm.entrySet()) {
			int key = mu.getKey(); 
			System.out.println("data in key is  -" + key);
			String s = mu.getValue();
			System.out.println(" and data in corresponding value is-  "+ s);
		}
	}
}

