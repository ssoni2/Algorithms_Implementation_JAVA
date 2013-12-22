package com.intern;

public class StringPermutation{
	public static void main(String[] args){
		String s1 = args[0].toLowerCase();
		String s2 = args[1].toLowerCase();
		char[] arrayS1 = s1.toCharArray();
		char[] arrayS2 = s2.toCharArray();
		java.util.Arrays.sort(arrayS1);
		java.util.Arrays.sort(arrayS2);
		String sortedS1 = new String(arrayS1);
		String sortedS2 = new String(arrayS2);
		if(sortedS1.equalsIgnoreCase(sortedS2)){
			System.out.println("Given String are Permutation of each other");
		}
		else{
			System.out.println("Different String. Not Permatation");
		}
	}
}