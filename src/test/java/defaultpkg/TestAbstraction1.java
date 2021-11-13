package defaultpkg;

abstract class Shape{
	abstract void area();
	abstract void perimeter();
}
class Rect extends Shape {
	
@Override
void area() { 
System.out.println("area of rectangle is l*b");
	}
@Override
void perimeter() {
	System.out.println("perimeter of rectangle is 2(l+b)");
}
}
public class TestAbstraction1 {
public static void main(String[] args) {
	Shape r = new Rect();
	r.area();
	r.perimeter();
}
}
