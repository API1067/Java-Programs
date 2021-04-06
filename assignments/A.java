package com.assignments;

public class A{
	public void addition(int a,int b){
		int sum = a+b;
		System.out.println("Sum="+sum);
	}
	public void multiplication(int a,int b){
		int product = a*b;
		System.out.println("Multiply="+product);
	}
	public void division(int a,int b){
		if (b != 0){
			int div = a/b;
			System.out.println("Div="+div);
		}
		else{
		System.out.println("Divisor can not be 0. Change value of b");
		}
	}
	public void subtraction(int a,int b){
		int sub = a-b;
		System.out.println("Minus="+sub);
	}
	public void increment(int a){
		int sum = a++;
		System.out.println("Increment="+sum);
	}
	public void decrement(int a){
		int decrement = a--;
		System.out.println("Decrement="+decrement);
	}
	public void modulus(int a,int b){
		int mod = a%b;
		System.out.println("Mod="+mod);
	}
}