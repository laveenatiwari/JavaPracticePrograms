package practice.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram2 {

	static boolean isAnagram(String a, String b) {
		/*First way
        if ( a.length() != b.length() ) {
            return false; 
        }
        String a1=a.toLowerCase();
        String a2=b.toLowerCase();
        char[] c1 = a1.toCharArray();
        char[] c2 = a2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String str1 = new String(c1);
        String str2 = new String(c2);
        return str1.equals(str2);
		 */

		//test for invalid input
		if(a==null||b==null|a.equals("")||b.equals("")){
			throw new IllegalArgumentException();
		}
		//initial test for non anagrams
		if(a.length()!=b.length()) {
			return false;
		}
		a=a.toLowerCase();
		b=b.toLowerCase();
		//populate a map with letters and frequencies from string b
		Map<Character,Integer> map = new HashMap<>();
		for(int k=0; k<b.length();k++) {
			char letter = b.charAt(k);
			if(!map.containsKey(letter)) {
				map.put(letter, 1);
			}else {
				Integer frequency =map.get(letter);
				map.put(letter, ++frequency);
			}
		}
		//test each letter in String a against data in map
		//return if letter is absent in the map or its frequency is 0
		//otherwise decrease the frequency by 1
		for(int k=0; k<a.length(); k++) {
			char letter = a.charAt(k);
			if(!map.containsKey(letter))
				return false;
			Integer frequency =map.get(letter);
			if(frequency ==0) 
				return false;
			else
				map.put(letter, --frequency);
		}
		return true;
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
