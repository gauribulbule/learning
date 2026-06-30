package com.utiltiies;
import java.util.*;
public class ArraysDemoExamples {

	public static void main(String[] args) {
	int num[]= {4,1,6,9,8,7,3};
	System.out.println("Before Sort");
	for(int n:num) {
		System.out.print(n+" ");
	}
	Arrays.sort(num);
	
	System.out.println();
	System.out.println("After Sort");
	for(int n:num) {
		System.out.print(n+" ");
	}
	System.out.println();
	int searchElement = Arrays.binarySearch(num, 6);
	System.out.println("element present at "+searchElement);
	int copyArray[]=Arrays.copyOfRange(num, 2, 4);		// start from index 0, end start with 1
	for(int num1:copyArray) {
		System.out.println(num1);
	}
	}
	
}
