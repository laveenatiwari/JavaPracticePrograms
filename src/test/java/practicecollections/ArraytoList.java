package practicecollections;

import java.util.Arrays;
import java.util.List;

public class ArraytoList {
public static void main(String[] args) {
	String[] words = {"hel","hi","laila","bbye"};
	List wordList = Arrays.asList(words);
	System.out.println(wordList);
	
	Integer[] nums = {1,2,3,4};
	List numArray = Arrays.asList(nums);
	System.out.println(numArray);
}
}
