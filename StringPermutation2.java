package com.intern;

public class StringPermutation2{
	public static void main(String[] args){
		String s1 = args[0].toLowerCase();
		String s2 = args[1].toLowerCase();
		int[] status = new int[256];
		for(char c : s1.toCharArray()){
			status[c]=1;
		}
		for(int i=0; i< s2.length(); i++){
			if(--(status[s2.charAt(i)]) != 0){
				System.out.println("Different String. Not Permatation");
				return;
			}
		}
		System.out.println("Given String are Permutation of each other");
		
	}
}