package practice.hackerrank;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		SortedSet<String> sets = new TreeSet<String>();
		for(int i=0; i<str.length()-k;i++) {
			sets.add(str.substring(i, i+k));
			
		}
		System.out.println(sets.first());
		System.out.println(sets.last());
	}
}
