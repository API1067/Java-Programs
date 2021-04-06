package com.apisero;
import java.util.ArrayDeque;

public class arraydequeue {
	public static void main(String args[]){
			
		ArrayDeque<Integer> abc = new ArrayDeque<Integer>();
		System.out.println(abc);
		abc.add(5);
		abc.add(10);
		System.out.println(abc);
		
		System.out.println(abc.offer(0));
		abc.addFirst(6);
		System.out.println(abc);
	}
}
