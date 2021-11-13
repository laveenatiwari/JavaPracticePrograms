package defaultpkg;
import java.util.Scanner;

public class Armsstrong {   
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check whether armstrong or not - ");
		int n = sc.nextInt();
		System.out.println("number provided for armstrong check is - " + n);
		int c=0, temp,a;
		temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("number provided by user  is an armstrong number");   
	    else  
	        System.out.println("number provided by user is not armstrong number");   
	   }  
	}

