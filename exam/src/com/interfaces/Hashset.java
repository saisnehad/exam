package com.interfaces;

import java.util.HashMap;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		HashMap<String, Number>personsal = new HashMap<String, Number>(10, 12);
		personsal.put("aa", 2000);
		personsal.put("hg", 70000);
		personsal.put("sg", 6000);
		personsal.put("nh", 10000);
		personsal.put("cd", 21000);
		System.out.println(personsal.values());
		Set<String> persons= personsal.keySet();
		for (String st : persons){
		System.out.println(persons);

	}

}
}