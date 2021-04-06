package com.apisero;
import java.util.HashMap;
import java.util.Map;

public class hashmap {

	/**
	 * @param args
	 */
	//Unordered form in continuous mem loc
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Float,String> abc = new HashMap<Float,String>();
		abc.put(5.0f,"Bangalore");
		abc.put(2.0f,"Patna");
		abc.put(3.0f,"Delhi");
		System.out.println(abc.get(2.0f));//Get value using key
		System.out.println(abc.values());//get all values
		System.out.println(abc.keySet());//get all keys
		abc.remove(3.0f);//delete entry using key can also be used as key value pair
		System.out.println(abc);
		System.out.println(abc.entrySet());
		System.out.println(abc.containsKey(2.0f));
		System.out.println(abc.containsValue("Patna"));
		System.out.println(abc.isEmpty());
		//abc.replace(2.0f,"Patna","Patliputra");  Not present in this java version
		System.out.println(abc.size());
		System.out.println(abc);
		
		
		Map<Float,String> xyz = new HashMap<Float,String>();//Interface
		xyz = (Map<Float, String>) abc.clone();
		System.out.println(xyz);

	}

}
