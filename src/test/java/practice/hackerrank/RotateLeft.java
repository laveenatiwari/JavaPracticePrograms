package practice.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RotateLeft {

	static int[] rotLeft(int[] a, int d) {
		//a= 1,2,3,4,5
		int size = a.length;   //5
		int[] rotated_Array = new int[size];
		int i =0;
		int rotated_index = d;  //2
		while(rotated_index<size) {    
			rotated_Array[i]= a[rotated_index];
			i++;
			rotated_index++;
		}
		rotated_index=0;
		while(rotated_index<d) {
			rotated_Array[i]= a[rotated_index];
			i++;
			rotated_index++;
		}
		return rotated_Array;
	}

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		String[] nd = scanner.nextLine().split(" ");
		int n = Integer.parseInt(nd[0]);
		int d = Integer.parseInt(nd[1]);
		int[] a = new int[n];
		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}
		int[] result = rotLeft(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.println((String.valueOf(result[i])));
			if (i != result.length - 1) {
				System.out.println(" ");;
			}
		}
		scanner.close();
	}
}
