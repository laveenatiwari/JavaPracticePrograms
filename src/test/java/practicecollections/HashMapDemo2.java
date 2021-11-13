package practicecollections;

import java.util.LinkedHashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(100,"Amit");    
	     map.put(101,"Vijay");    
	     map.put(102,"Rahul");  
	     map.put(103,"Rahul");   
	     map.put(104,"Harry");   
	     System.out.println(" Keys are - " + map.keySet());
	     System.out.println(" values are - " + map.values());
	     System.out.println(" key value pairs -" + map.entrySet());
	     map.remove(103);
	     System.out.println(" key value pairs -" + map.entrySet());
	}
}
