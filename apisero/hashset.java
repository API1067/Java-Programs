package com.apisero;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
public class hashset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> abc = new HashSet<Integer>();
		abc.add(5);
		abc.add(10);
		abc.add(6);
		System.out.println(abc);
		abc.remove(1);//pass index doesnt work as indexing not possible
		System.out.println(abc);
		System.out.println(abc.isEmpty());
		System.out.println(abc.contains(10));
		System.out.println(abc.hashCode());
		Integer a=new Integer(5);
		Integer b=new Integer(5);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		Set<Integer> xyz = new HashSet<Integer>();//Interface implementation
		xyz = (Set<Integer>) abc.clone();
		System.out.println(xyz);
		
		
		//Linked HAsh set same methods, difference is memory is not allocated continuously in Linked hash set
		

	}

}
