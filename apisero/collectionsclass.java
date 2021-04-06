package com.apisero;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsclass {

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
		System.out.println(abc);
		Collections.sort(abc);
		System.out.println(abc);
		//reverse
		//shuffle
		//max
		//min
		Collections.reverse(abc);
		System.out.println(abc);
		Collections.shuffle(abc);
		System.out.println(abc);
		System.out.println(Collections.max(abc));
		System.out.println(Collections.min(abc));
	}

}
