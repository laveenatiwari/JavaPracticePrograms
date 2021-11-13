package practice.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuestion {
public static void main(String[] args) {
	ArrayList[] al = new ArrayList[20000];
	Scanner sc = new Scanner(System.in);
	int lists = sc.nextInt();
	
	for(int i=0; i<lists;i++) {
		al[i]=new ArrayList();
		int number = sc.nextInt();
		for(int j=0;j<number;j++) {
			int value = sc.nextInt();
			al[i].add(value);
		}
	}
	int queries = sc.nextInt();
	for(int i=0;i<queries;i++) {
		int x= sc.nextInt();
		int y = sc.nextInt();
		try {
			System.out.println(al[x-1].get(y-1));
		}catch(Exception e) {
			System.out.println("Error!");
		}
	}
}
}
