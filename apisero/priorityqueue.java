package com.apisero;
import java.util.PriorityQueue;
import java.util.Queue;
public class priorityqueue {
	public static void main(String args[]){
		PriorityQueue<Integer> abc = new PriorityQueue<Integer>();
		System.out.println(abc);
		abc.add(5);
		abc.add(10);
		System.out.println(abc);
		abc.peek();//returns 1st element
		System.out.println(abc);
		abc.poll();//returns 1st element and deletes the element also
		System.out.println(abc);
		Queue<Integer> xyz = new PriorityQueue<Integer>();
		xyz = abc;
		System.out.println(xyz);
		xyz.add(15);
		System.out.println(abc);
		
	}

}
