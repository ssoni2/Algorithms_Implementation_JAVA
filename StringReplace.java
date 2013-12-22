package com.intern;

public class StringReplace{
	public static void main(String[] arg){
		String input = "";		
		for(String s : arg){
			input = input + s +" ";
		}
		
		String replace = "%20";
		String result = input.replaceAll(" ","%20");
		System.out.println(input+" ---> "+result);
	}
}