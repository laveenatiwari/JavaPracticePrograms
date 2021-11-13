package practice.hackerrank;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;

public class ListPract2 {
   public static void main(String[] args) {
	   	
	   Scanner sc = new Scanner(System.in);
	   int Numbers = sc.nextInt();
	   LinkedList<Integer> list = new LinkedList<>();
	   for(int i=0; i<Numbers; i++) {
		   int value = sc.nextInt();
		   list.add(value);   
	   }
	   int largest = Collections.max(list);
	   
	   if(list == null || list.size()==0) {
		   System.out.print("0");
	   }else {
		   System.out.print(largest);
	   }
}
}
