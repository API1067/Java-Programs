package com.assignments;
// 31.3.2021 Program 1/3
import java.util.ArrayList;
import java.util.Iterator;
public class arraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		ArrayList<String> abc = new ArrayList<String>();
		abc.add("Apple");
		abc.add("Mango");
		abc.add("Banana");
		abc.add("Grapes");
		abc.add("Orange");
		Iterator<String> it = abc.iterator();
		while(it.hasNext()) {
			  System.out.println("No.of character at index "+count+"="+it.next().length());
			  count++;
			}

	}

}
