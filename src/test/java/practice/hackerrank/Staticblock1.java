package practice.hackerrank;

import java.util.Scanner;

public class Staticblock1 {

	static Scanner scan = new Scanner(System.in);
	static int B = scan.nextInt();
	static int H = scan.nextInt();
	static boolean flag = true;
	static {
		try {
			if (B<=0 || H<=0) {
				flag =false;
				System.out.println("java.lang.Exception: Breadth and height must be positive");
			}
			}
		catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}
}

