package com.design;

public class Immutable {
	
	public String person;
	
	
	public String getPerson() {
		return person;
	}
	
	private Immutable(String person){
		this.person = person;
	}
}
