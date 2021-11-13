package abstractEg;

interface A{
	void a();
	void b();
	void c();
	void d();
	
}
abstract class B implements A{
	public void c() {
		System.out.println("this is method c in bstract class B");
	}
}
class M extends B{

	public void a() {
		System.out.println("this is method a in bstract class M");
	}

	public void b() {
		System.out.println("this is method b in bstract class M");
	}

	public void d() {
		System.out.println("this is method d in bstract class M");
	}
	
}
public class TestAbstract {
public static void main(String[] args) {
	A  obj1 = new M();
	obj1.c();
	obj1.a();obj1.b();obj1.d();
}
}
