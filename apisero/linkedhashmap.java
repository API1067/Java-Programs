package com.apisero;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class linkedhashmap {


	/**
	 * @param args
	  
	 */
	//Insertion order is maintained, in discontinuous memory location
	public static void main(String[] args, Float Null) {
		// TODO Auto-generated method stub
		LinkedHashMap<Float,String> abc = new LinkedHashMap<Float,String>();
		abc.put(5.0f,"Bangalore");
		abc.put(2.0f,"Patna");
		abc.put(3.0f,"Delhi");
		//abc.put(,); Null can be passed
		System.out.println(abc.get(2.0f));//Get value using key

	}

}
