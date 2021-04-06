package com.apisero;

import java.util.ArrayList;
import java.util.Scanner;
//Assignment 01.04.2020 1/4
public class assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> abc = new ArrayList<Integer>();
		abc.add(5);
		abc.add(25);
		abc.add(15);
		abc.add(35);
		abc.add(10);
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter first position- ");
		int a= sc.nextInt();
		System.out.print("Enter second position- ");
		int b =sc.nextInt();
		try{
			int c = abc.get(a);
			abc.set(a,abc.get(b));
			abc.set(b, c);
			System.out.println(abc);
			
		}
		catch(Exception e){
			System.out.println("Please enter the index numbers between 0 and "+abc.size());
		}
	}

}
