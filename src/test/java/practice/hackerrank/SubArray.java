package practice.hackerrank;

import java.util.Scanner;

public class SubArray {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n= sc.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n;i++){
			array[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(negativeSubarrays(array));
	}
	 private static int negativeSubarrays(int[] array) {
	        int count = 0;
	        for (int i = 0; i < array.length; i++) {
	            int sum = 0;
	            for (int j = i; j < array.length; j++) {
	                sum += array[j];
	                if (sum < 0) {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	}

/*
If we have a 3-element array such as [1,2,3], the order that we consider the subarrays are shown in the table below.

i  j   subarray
-  -   --------
0  0       [1]     
0  1     [1,2]
0  2   [1,2,3]
1  1       [2]
1  2     [2,3]
2  2       [3]
*/

