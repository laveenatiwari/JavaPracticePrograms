package practicecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList132 {
public static void main(String[] args) {
	ArrayList <String> al = new ArrayList<String>();
	al.add("Ravi");
	al.add("lal");
	al.add("nimo");
	al.add("nimo");
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	//static void reverse method reverses the order of the list 
	Collections.reverse(al);
	System.out.println("order of list after being reversed is " + al);
}
}
