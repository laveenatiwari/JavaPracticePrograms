package com.arrays;

public class ArrayRotation {
	static int[] rotLeft(int[] a, int d) {
		int[] result = new int[a.length];        
		System.arraycopy(a, 0, result, a.length- d, d );
		System.arraycopy(a, d , result, 0, a.length -d );        
		return result;
	   }
}
