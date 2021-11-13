package practicecollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopArrayList {
	public static void main(String[] args) {
		String sArray[] =new String [] {"Array1", "Array2", "Array3" };
		
		//convert array to list
		List<String> list1 = Arrays.asList(sArray);
		//iterator loop
		System.out.println("#loop 1 for iterator");
		Iterator<String> it1 = list1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		//for Loop
		System.out.println("#loop 2");
		for(int i =0; i < list1.size(); i++) {
			System.out.println(list1.get(i));  //get returns the specified position in the list
		}
		
		//for each loop advance
		System.out.println("iterating though for each loop");
		for(String temp : list1) {
			System.out.println(temp);
		}
	
		System.out.println("iterating through while loop");
		int j=0;
		while(j <list1.size()) {
			System.out.println(list1.get(j));
			j++;
		}
	}

}
