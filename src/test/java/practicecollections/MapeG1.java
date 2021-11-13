package practicecollections;

import java.util.HashMap;
import java.util.*;

public class MapeG1 {
public static void main(String[] args) {
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(100, " ABC");
	map.put(200, " XYZ ");
	map.put(300, " DEF");
	System.out.println("After invoking put method");
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey() + "" +m.getValue());
	}
	map.putIfAbsent(103, "GHI");
	System.out.println("After invoking putifabsent method");
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey() + " "+ m.getValue());
	}
	HashMap<Integer,String> map2 = new HashMap<Integer,String>();
	map2.put(104, "JKL");
	map2.putAll(map2);
	System.out.println("After invoking put All");
	for(Map.Entry m : map.entrySet()) {
		System.out.println(m.getKey() + " " + m.getValue());
	}
}
}
