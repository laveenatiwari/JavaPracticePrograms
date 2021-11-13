package practice.hackerrank;

import java.lang.reflect.Method;

class Printer{
	public void printArray(Object[] array) {
		for(Object obj :array) {
			System.out.println(obj);
		}
	}
}
public class JavaGenericspractice {
public static void main(String[] args) {
	Printer print = new Printer();
	Integer[] intArray = {1,2,3};
	String[] stringArray = {"Hello","Myworld"};
	print.printArray(intArray);
	print.printArray(stringArray);
	int count =0;
	for(Method method:Printer.class.getDeclaredMethods()) {
		String name = method.getName();
		if(name.equals("printArray"))
			count++;
	}
	if(count>1)
		System.out.println("Method overloading is not allowed");
}
}
