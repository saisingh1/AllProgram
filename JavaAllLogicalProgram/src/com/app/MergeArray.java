package com.app;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int []array1= {1,2,3,4};
		int []array2= {5,6,7,8};
		
		int lenA=array1.length;
		int lenB=array2.length;
		int [] result=new int[lenA+lenB];
		System.arraycopy(array1, 0, result, 0, lenA);
		System.arraycopy(array2, 0, result, lenA, lenB);
		System.out.println(Arrays.toString(result));
	}
}
