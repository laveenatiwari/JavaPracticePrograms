package instanceofOperator;

public class Ani {}
	class Dog1 extends Ani{//Dog inherits Animal  
		  
		 public static void main(String args[]){  
		 Ani d=new Dog1();  
		 System.out.println(d instanceof Ani);//true  
		 }  
		}  

