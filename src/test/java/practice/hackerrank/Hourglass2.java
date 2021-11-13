package practice.hackerrank;

import java.util.Scanner;

public class Hourglass2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] [] = new int[6][6];
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				arr[i][j]=in.nextInt();
			}
		}
		int max_hourglass_sum= -63;
		for(int i=0;i<4;i++) {
			for(int j=0; j<4;j++) {
				int current_sum =arr[i][j]+arr[i][j+1]+arr[i][j+2]
						+arr[i+1][j+1]+
						arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(current_sum>max_hourglass_sum) {
					max_hourglass_sum=current_sum;
				}
			}
		}
		System.out.println(max_hourglass_sum);
	}
}
