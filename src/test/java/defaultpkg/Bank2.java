package defaultpkg;

class RBI{
	int getRateOfInterest() {
		return 0;	
	}
}
class SBI2 extends RBI{
	int getRateOfInterest() {
		return 8;	
	}
}
class ICICI extends RBI{
	int getRateOfInterest() {
		return 6;	
	}
}
class HDFC extends RBI{
	int getRateOfInterest() {
		return 7;	
	}
}

public class Bank2 {
public static void main(String[] args) {
	RBI r;
	r = new SBI2();
	r = new ICICI();
	r = new HDFC();
	System.out.println("SBI rate of interest is " + r.getRateOfInterest());
	System.out.println("hdfc rate of interest is " + r.getRateOfInterest());
	System.out.println("ICICI rate of interest is " + r.getRateOfInterest());
	}
}
