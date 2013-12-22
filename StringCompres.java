package com.intern;
public class StringCompres{
	public static void main(String[] args){
		String test = args[0];
		StringBuffer result = new StringBuffer();
		result.append(test.charAt(0));
		char c = test.charAt(0);
		int size=1;
		for(int i=1; i<test.length(); i++){
			char t = test.charAt(i);
			if(c==t){
				size++;
			}else{
				result.append(size);
				result.append(t);
				size=1;
				c= t;
			}
		}
		result.append(size);
		if(result.length()<test.length()) System.out.println(result);
		else System.out.println(test);
	}
}