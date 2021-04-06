package com.apisero;

import java.util.Iterator;
import java.util.TreeSet;
//Assignment 01.04.2020 2/4
public class assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Character> abc = new TreeSet<Character>();
		abc.add('L');
		abc.add('N');
		abc.add('M');
		abc.add('O');
		abc.add('P');
		abc.add('Q');
		System.out.println("the initial set that consists of 6 elements like L, M, N, O, P and Q");
		System.out.println(abc);
		System.out.println("the reversed set of the above elements");
		System.out.println(abc.descendingSet());
		Iterator<Character> it = abc.iterator();
		System.out.println("the set of elements that are less than or equal to the element ‘O’");
		while(it.hasNext()) {
			char temp=it.next();
			if (temp-'O'<=0){
			    System.out.print(temp+",");
			
			}
		}
		System.out.println();
		it = abc.iterator();
		System.out.println("the set of elements that do not contain the element ‘Q’");
		while(it.hasNext()) {
			char temp=it.next();
			if (temp-'Q'!=0){
			    System.out.print(temp+",");
			
			}
		}
		System.out.println();
		it = abc.iterator();
		System.out.println("the set of elements that are greater than the element ‘N’");
		while(it.hasNext()) {
			char temp=it.next();
			if (temp-'N'>0){
			    System.out.print(temp+",");
			
			}
		}
		System.out.println();
		it = abc.iterator();
		System.out.println("the set of elements that do not contain the element ‘L");
		while(it.hasNext()) {
			char temp=it.next();
			if (temp-'L'!=0){
			    System.out.print(temp+",");
			
			}
		}
		System.out.println();
	}
	

}
