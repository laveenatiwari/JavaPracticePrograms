package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("How many elements ? ");
	int n = Integer.parseInt(br.readLine());
	int arr[]= new int[n];
	for(int i=0; i< n; i++) {
		System.out.println(" enter int : ");
		arr[i]= Integer.parseInt(br.readLine());
	} 
	int limit = n-1;//elements from 0 to n-1
	boolean flag = false; //if it is true then swapping done
	int temp; //temporary variable
	for(int i=0; i<limit; i++) {
		for(int j=0; j<limit-1 ; j++) {
			if(arr[j]> arr[j+1]) {
				temp =arr[j];
				arr[j]= arr[j+1];
				arr[j+1]=temp;
				flag=true; //true-> swapping done
			}
		}
	
		if(flag ==false)
			break; //no swapping, so come out
		else flag=false;
	}
	System.out.println(" the sorted array is -");
	for(int i=0; i<n ;i++) System.out.println(arr[i]);
}
}
