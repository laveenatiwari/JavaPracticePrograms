package practicecollections;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(123,"lily");
		hm.put(124,"daisy");
		hm.put(125,"sunflower");
		hm.put(126,"rose");
		hm.put(127,"Mogra");
		System.out.println("After invoking put method ");
		for(Map.Entry m1 : hm.entrySet() ) {
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		hm.remove(123);
		System.out.println(" updated list of elements in map is");
		for(Map.Entry m1: hm.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		hm.putIfAbsent(123, "suman");
		hm.remove(126, "bulbul");
		hm.replace(124, "Rushika");
		System.out.println("list after using putIfAbsent " + hm);
		hm.replaceAll((k,v)->"HOME");
		System.out.println("list after using REPLACE ALL function " + hm);
	}

}
