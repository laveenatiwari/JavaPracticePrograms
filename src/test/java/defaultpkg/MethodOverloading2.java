package defaultpkg;
class Adder2{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
}
//method overloading -changing datatype of arguments
public class MethodOverloading2 {
	public static void main(String[] args) {
	System.out.println(Adder2.add(11,11));
	System.out.println(Adder2.add(11.1,11.1));
}
}