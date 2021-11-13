package practicecollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("daisy");
		ll.add("sunflower");
		ll.add("rose");
		ll.add("lily");
		System.out.println("list = " + ll);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String element ;
		int position, choice =0;
		
		while(choice<4) {
			System.out.println(" \n linkedlist operations");
			System.out.println("1. add an element ");
			System.out.println("2. remove an element ");
			System.out.println("3. chance an element ");
			System.out.println("4. exit ");
			
			System.out.println(" your choice -");
			choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1 : System.out.println(" Enter element : ");
					element  = br.readLine();
					System.out.println(" at what position ? ");
					position = Integer.parseInt(br.readLine());
					ll.add(position -1, element);
					break;
			case 2 : System.out.println(" Enter position : ");
			position = Integer.parseInt(br.readLine());
			ll.remove(position -1);
			break;	
			case 3 : System.out.println(" Enter position : ");
			position = Integer.parseInt(br.readLine());
			System.out.println("enter new element - ");
			element = br.readLine();
			ll.set(position-1,element);
			break;
			
			default: return;	
			}
			System.out.println(" List = ");
			Iterator it = ll.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}

}
