package com.design;

public class ImmutableMain {

private Info person;
	
	public Info getPerson() {
		return person;
	}
	
	public ImmutableMain(Info person){
		this.person = person;
	}
	
	public static void main(String[] args) {
		Info person = new Info();
		person.setFname("aa");
		person.setLname("ss");
		person.setAge(26);
		ImmutableMain a = new ImmutableMain(person);
		
	}
}