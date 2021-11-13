package defaultpkg;

public interface Bank {
	float rateOfInterest();
}
class SBI implements Bank{
	public float rateOfInterest() {
	return 5.6f;
	}
}
class PNB implements Bank{
	public float rateOfInterest() {
		return 7.8f;
	}
}
class TestInterface2{
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("RATE OF INterest with SBI is - " + b.rateOfInterest());
		Bank c = new PNB();
		System.out.println("RATE OF INterest with SBI is - " + c.rateOfInterest());
	}
}