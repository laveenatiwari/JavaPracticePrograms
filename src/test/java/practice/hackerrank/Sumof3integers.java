package practice.hackerrank;

import java.io.*;
import java.util.Scanner;

public class Sumof3integers {
	// Complete the getSequenceSum function below.
	static long getSequenceSum(int i, int j, int k) {
		int sum=0;
		do{
			System.out.println( "printing values of sum and i - " + sum + "  " +i );
			sum=sum+i;
			
			i++;    
			System.out.println("i after increment is - "+ i);
		}while(i<j);
		while(j>=k){
			System.out.println( "printing values of sum and j - " + sum + "  " + j );
			sum=sum+j;
			
			j--;
			System.out.println("j is" +j);
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);

		int i = sc.nextInt();

		int j = sc.nextInt();

		int k = sc.nextInt();

		long res = getSequenceSum(i, j, k);

		System.out.println(res);
		sc.close();
	}
}
