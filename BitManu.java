package com.intern;
public class BitManu{
	static String intToBinary( int theInt ) {
 		String ret = "";
 		for( int i = 31; i >= 0; i-- ) {
 			if( (theInt & (1 << i)) != 0 ) {
 				ret += "1";
 			} else {
 				ret += "0"; 
 			}
 		}
 	return ret;
 	}
	static int getbit(int data,int pos){
		if((data & (1<<pos)) != 0) return 1;
		else return 0;
	}
	static int setbit(int data,int pos){
		return (data | (1<<pos));
		
	}
	static int clearbit(int data,int pos){
		return (data & ~(1<<pos));
		
	}
	static int clearMSBto(int data,int pos){
		return (data & ((1<<pos)-1));
		
	}
	static int clearLSBto(int data,int pos){
		return (data & ~(-1 >>> (31-pos)));
		
	}
	
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		System.out.println(intToBinary(n));
		System.out.println(getbit(n,3));
		System.out.println(intToBinary(setbit(n,3)));
		System.out.println(intToBinary(clearbit(n,3)));
		System.out.println(intToBinary(clearMSBto(n,3)));
		System.out.println(intToBinary(clearLSBto(n,3)));
	}
}
