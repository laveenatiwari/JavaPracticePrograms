package defaultpkg;

public interface int2 extends printable{
void talk();
}
class TestInterface4 implements int2{

	public void print() {
		System.out.println("hi");
	}

	public void talk() {
		System.out.println("there");
	}
	
	public static void main(String[] args) {
		TestInterface4 obj2= new TestInterface4();
		obj2.print();
		obj2.talk();
	}
}