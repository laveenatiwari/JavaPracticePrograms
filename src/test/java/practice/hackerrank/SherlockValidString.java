package practice.hackerrank;
import java.io.IOException;
import java.util.Scanner;

public class SherlockValidString {
	static String isValid(String s) {
		int length = s.length();
		int string_frequencies[] = new int[26];
		//mapping frequencies 
		for(int i=0; i<length;  i++){
			char current_char =s.charAt(i);
			int current_charint = (int)current_char;
			int position = current_charint - (int)'a';
			string_frequencies[position]++;          
		}
		int unmatched =0;
		for(int i=0;i<26;i++){
			if(string_frequencies[0]!=string_frequencies[i] && string_frequencies[i]>0)
				unmatched++;
		}
		if (unmatched<=1){
			return "YES";
		} else {
			return "NO";
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String result = isValid(s);
		System.out.println(result);
		scanner.close();
	}
}
