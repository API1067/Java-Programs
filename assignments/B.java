package com.assignments;

public class B extends A{
	public void and(int a,int b){
		int sum = a&b;
		System.out.println("And operation="+sum);
	}
	public void or(int a,int b){
		int oro = a|b;
		System.out.println("Or operation="+oro);
	}
	public void xor(int a,int b){
		int xoro = a^b;
		System.out.println("XOR="+xoro);
	}
	public void compliment(int a){
		int comp = ~a;
		System.out.println("Compliment="+comp);
	}
	public void rightshift(int a,int pos){
		int rshift = a>>pos;
		System.out.println("Right shift="+rshift);
	}
	public void leftshift(int a,int pos){
		int lshift = a<<2;
		System.out.println("Left shift="+lshift);
	}

}
