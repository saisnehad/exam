package com.interfaces;

public abstract class Person {

	abstract void Fname();

	abstract void Lname();

}

class A extends Person {

	@Override
	void Fname() {
		this.Fname();

	}

	@Override
	void Lname() {
		this.Lname();

	}

}

class B extends Person {

	@Override
	void Fname() {
		this.Fname();

	}

	@Override
	void Lname() {
		this.Lname();

	}

}
