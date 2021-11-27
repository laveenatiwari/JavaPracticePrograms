package defaultpkg;

public class ReverseArray {
	
	public static void main(String[] args) {
	//	int [] arr = new int [] {1,2,3,4,5};
		String str = "hello this is new";
		char[] s = str.toCharArray();
		System.out.println("original array :");
		for(int i=0; i<s.length;i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
			System.out.println("Array in reverse order :");
			for(int i=s.length-1; i>=0; i--) {
				System.out.print(s[i]+ " ");
			}
	}

}
