package practice.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPractic {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        try{
	            int x=sc.nextInt();
	            int y=sc.nextInt();
	            int z=x/y;
	            System.out.println(z);
	        }catch(InputMismatchException ime){
	            System.out.println(ime.getClass().getName());
	        }catch(ArithmeticException ae){
	            System.out.println(ae.getClass().getName()+": "+ae.getMessage());
	        }catch(Exception i){
	            System.out.println(i.getMessage());
	}
	    }

}
