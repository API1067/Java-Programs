package com.apisero;
import java.util.Vector;
public class vector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> abc = new Vector<Integer>();
		abc.add(1);
		abc.add(2);
		abc.add(4);
		abc.add(5);
		abc.add(4);
		System.out.println(abc);
		abc.isEmpty();
		//abc.clear();
		System.out.println(abc.capacity());
		abc.contains(2);
		System.out.println(abc.lastIndexOf(4));
		abc.remove(0);
		System.out.println(abc);
		abc.removeElement(4);
		System.out.println(abc);
		abc.removeAllElements();
		System.out.println(abc);
		
		

	}

}
