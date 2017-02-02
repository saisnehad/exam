package com.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		List<String> place = new ArrayList<String>();
		place.add("lisa");
		place.add("tina");
		place.remove("lisa");
		for(String places : place){
			System.out.println(place.toString());

		}
		
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		Collections.sort(numbers);
		System.out.println(numbers.toString());
	}

}
