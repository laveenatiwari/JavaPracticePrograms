package defaultpkg;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public interface Showable {
	void show();
}
class A7 implements printable, Showable{
	public void show() {
		System.out.println("Welcome");
	}

	public void print() {
		System.out.println("print");
	}

	public static void main(String[] args) {
		A7 obj = new A7();
		obj.print();
		obj.show();
	}
}