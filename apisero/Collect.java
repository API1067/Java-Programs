package com.apisero;
import java.util.ArrayList;//Class
import java.util.List;//Interface
public class Collect {
	public static void main(String args[]){
		//list using class
		ArrayList<Integer> abc = new ArrayList<Integer>();
		System.out.println(abc);
		//List using Interface
		/*List<Integer> xyz = new ArrayList<Integer>();
		System.out.println(xyz);*/
		abc.add(5);
		abc.add(10);
		System.out.println(abc);
		abc.add(0,0);
		abc.add(3,6);
		System.out.println(abc);
		abc.remove(2);//pass index
		System.out.println(abc);
		System.out.println(abc.isEmpty());
		System.out.println(abc.contains(10));
		/* other methods
		 * abc.equals();
		 * abc.clone();
		 */
		abc.indexOf(10);
		System.out.println(abc);
		
		//Using interface and clone method
		List<Integer> xyz = new ArrayList<Integer>();
		xyz=(List<Integer>) abc.clone();
		System.out.println(xyz);
		
		System.out.println(xyz.equals(abc));
		System.out.println(xyz.size());
		//abc.sort(null);
		System.out.println(xyz);
		abc.clear();//deletes only values
		System.out.println(abc);
		
		
	}

}
