package com.intern;

public class StringReverse{
	public static void main(String[] args){
		
		String test = args[0];	
		System.out.println(test);
		StringBuilder test2 = new StringBuilder(test);	
	
		test2.reverse();
		System.out.println(test2.toString());	
		String temp = "";
		for(int j= test.length()-1 ; j>=0; j--){
			temp = temp + test.charAt(j);
			
		}
		System.out.println(temp);
	}
}