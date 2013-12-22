package com.intern;

public class PrimeTest{
	public static void main(String[] args){
		int test = Integer.parseInt(args[0]);
		if(test<2) {
			System.out.println("Enter no greater then 1");
			return;
		}
		if(test==2) {
			System.out.println(test+" is prime");
			return;
		}
		if (test % 2 == 0){
		System.out.println(test+" is not prime");
		return;
		}
		for(int j = 3, m = (int) Math.sqrt(test); j <= m; j += 2) {
    			if(test % j == 0){
				System.out.println(test+" is not prime");
				return;
			}
       		}
		System.out.println(test+" is prime");
	}
}