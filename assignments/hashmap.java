package com.assignments;
//31.3.2021 Program 2/3
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
public class hashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		HashMap<Integer,String> abc = new HashMap<Integer,String>();
		abc.put(5,"Bangalore");
		abc.put(2,"Patna");
		abc.put(3,"Delhi");
		abc.put(6,"Dehradun");
		abc.put(7,"Noida");
		ArrayList<Integer> keys = new ArrayList<Integer>();
		ArrayList<String> values = new ArrayList<String>();
		keys.addAll(abc.keySet());
		values.addAll(abc.values());
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			  sum+=it.next();
			}
		System.out.println("Sum of keys= "+sum);
		Iterator<String> it1 = values.iterator();
		while(it1.hasNext()) {
			  System.out.println("No.of character at index "+count+"="+it1.next().length());
			  count++;
			}
		

	}

}
