package com.apisero;
import java.util.ArrayList;
import java.util.LinkedList;//Class
import java.util.List;//Interface
public class linkedlist {
	public static void main(String args[]){
		
	LinkedList<Integer> abc = new LinkedList<Integer>();
	abc.addFirst(10);
	System.out.println(abc);
	abc.addLast(5);
	System.out.println(abc);
	abc.removeFirst();
	System.out.println(abc);
	abc.removeLast();
	System.out.println(abc);
	abc.add(10);
	System.out.println(abc);
	List<Integer> xyz = new LinkedList<Integer>();
	System.out.println(xyz);
	xyz=(List<Integer>) abc.clone();
	System.out.println(xyz);
	}
	

}
