package com.intern;

public class StringUnique{
	public static void main(String[] args){
		try{
			String test = (String)args[0];
			boolean check = false;

			for(int j = 0; j<test.length(); j++){
			  char c = test.charAt(j);
			  			  for(int i = j+1; i<test.length(); i++){
				char c2 = test.charAt(i);
				//System.out.println(c+" "+c2);
				if(c==c2){
					System.out.println("Not a unique string");
					check = true;
					break;
				}
			  }
			  if(check){
				 break;
			  }
			}
			if(!check){
				System.out.println("String is unique");
				 
			  }
		}catch(Exception e){
			System.out.println("Provide a valid string as argument");
		}
	}
}