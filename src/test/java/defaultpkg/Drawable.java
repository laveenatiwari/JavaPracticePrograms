package defaultpkg;

public interface Drawable {
	public void draw();
}
class Rectangle implements Drawable{

	public void draw() {
		System.out.println("draw length and breadth");
	}
	
}
class Square implements Drawable{
	public void draw() {
		System.out.println("draw length of equal measure on both sides");
	}
}
class TestInterface1{
	public static void main(String[] args) {
		Drawable d = new Square();
		d.draw();
	}
}