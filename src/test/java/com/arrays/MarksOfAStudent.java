package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarksOfAStudent {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("How many subjects ?");
	int n = Integer.parseInt(br.readLine());
	int[] marks = new int[n];
	for(int i=0; i<n;i++) {
		System.out.println("Enter marks : ");
		marks[i] = Integer.parseInt(br.readLine());
	}
	//find total marks
	int tot=0;
	for(int i=0; i<n ;i++)
		tot = tot+ marks[i];
	System.out.println("Total marks = " + tot);
	
	//find percentage
	float percent = (float)tot/n;
	System.out.println("Percentage = " + percent);
	
}
}
