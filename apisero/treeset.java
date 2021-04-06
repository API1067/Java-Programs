package com.apisero;
import java.util.TreeSet;
import java.util.Set;
public class treeset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> abc = new TreeSet<Integer>();
		abc.add(5);
		abc.add(10);
		abc.add(6);
		System.out.println(abc);
		Set<Integer> xyz = new TreeSet<Integer>();//Interface implementation
		xyz = (Set<Integer>) abc.clone();
		System.out.println(xyz);

	}

}
