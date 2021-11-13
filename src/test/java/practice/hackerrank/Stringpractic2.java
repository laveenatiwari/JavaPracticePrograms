package practice.hackerrank;

import java.util.Scanner;

public class Stringpractic2 {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest ="";
		String largest = "";
		String tempSubStr = "";

		smallest = s.substring(0,k);
		largest = s.substring(0,k);

		for(int i = 1 ; i <= (s.length() - k); i++)
		{
			tempSubStr = s.substring(i,i+k);
			if( smallest.compareTo(tempSubStr) > 0 )
				smallest = tempSubStr;
			if( largest.compareTo(tempSubStr) < 0  )
				largest = tempSubStr;
		}
		return smallest + "\n" + largest;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
