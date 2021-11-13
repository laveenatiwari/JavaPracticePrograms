package defaultpkg;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		switch(number) {
		case 10:System.out.println("10");
		break;
		case 20:System.out.println("20");
		break;
		default:System.out.println("not in 10 or 20");
		sc.close();
		}
	}
}
