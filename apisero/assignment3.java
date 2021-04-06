package com.apisero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Assignment 01.04.2020 3/4
public class assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> abc = new HashMap<Integer,String>();
		abc.put(4,"Kerala");
		abc.put(3,"Tamil Nadu");
		abc.put(5,"Karnataka");
		abc.put(1,"Maharashtra");
		abc.put(2,"Telangana");
		System.out.println("Initial order:");
		System.out.println(abc);
		Set<Integer> a = new TreeSet<Integer>();
		a=abc.keySet();
		ArrayList<Integer> al = new ArrayList<>();
		al.addAll(a);
		Collections.reverse(al);
		Iterator<Integer> it = al.iterator();
		System.out.println("the set of elements in reverse order");
		while(it.hasNext()) {
			int temp=it.next();
			System.out.print(temp+"="+abc.get(temp)+", ");
		}
		System.out.println();
		
		it = a.iterator();
		System.out.println("the elements that are less than or equal to the key ‘3’");
		while(it.hasNext()) {
			int temp=it.next();
			if (temp<=3){
			System.out.print(temp+"="+abc.get(temp)+", ");
		}}
		System.out.println();
		
		it = a.iterator();
		System.out.println("the elements that do not contain the key ‘2’ and ‘5’");
		while(it.hasNext()) {
			int temp=it.next();
			if (temp!=2 && temp!=5){
			System.out.print(temp+"="+abc.get(temp)+", ");
		}}
		System.out.println();
		
		it = a.iterator();
		System.out.println("the elements that are greater than the key ‘3’");
		while(it.hasNext()) {
			int temp=it.next();
			if (temp>3){
			System.out.print(temp+"="+abc.get(temp)+", ");
		}}
		System.out.println();
		
		it = a.iterator();
		System.out.println("the elements that are lesser than or equal to the value ‘Maharashtra’");
		while(it.hasNext()) {
			int temp=it.next();
			if (abc.get(temp).compareTo("Maharashtra")<0){
			System.out.print(temp+"="+abc.get(temp)+", ");
		}}
		System.out.println();
		
		it = a.iterator();
		System.out.println("the elements that are greater than the value ‘Karnataka’");
		while(it.hasNext()) {
			int temp=it.next();
			if (abc.get(temp).compareTo("Karnataka")>0){
			System.out.print(temp+"="+abc.get(temp)+", ");
		}}
		System.out.println();
		
		it = a.iterator();
		System.out.println("the elements that does not contain the value ‘Kerala’ and ‘Telangana’");
		while(it.hasNext()) {
			int temp=it.next();
			if (!abc.get(temp).equals("Kerala") && !abc.get(temp).equals("Telangana")){
			System.out.print(temp+"="+abc.get(temp)+", ");
		}}
		System.out.println();
	}

}
