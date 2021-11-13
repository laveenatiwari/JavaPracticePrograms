package defaultpkg;

public class StringsPractice {
public static void main(String[] args) {
	String s1 =" A book on java" ;
	String s2= new String("I like it");
	char arr[] = { 'D','r','e','a','m','t','e','c','h','p','r','e','s','s'};
	String s3= new String(arr);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println("length of s1 is " +s1.length());
	System.out.println("joining string s1 and s2 " + s1.concat(s2));
	System.out.println(s1 + " and " +s3);
	System.out.println("using substring from index 2 in string s1- " + s1.substring(2));
	System.out.println(s2.toLowerCase());
	System.out.println(s3.toUpperCase());
}
}
