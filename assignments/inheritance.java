package com.assignments;
public class inheritance extends B{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance ob =new inheritance();
		ob.addition(5,6);
		ob.subtraction(6, 2);
		ob.multiplication(2, 3);
		ob.division(7, 3);
		ob.modulus(7, 3);
		ob.increment(5);
		ob.decrement(6);
		ob.and(10, 100);
		ob.or(10, 100);
		ob.compliment(8);
		ob.xor(10,100);
		ob.leftshift(1000, 2);
		ob.rightshift(10, 2);
	}

}
