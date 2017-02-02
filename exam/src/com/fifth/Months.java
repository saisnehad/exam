package com.fifth;

public enum Months {
	JANUARY(31), 
	FEBRUARY(28), 
	MARCH(30),
	APRIL(31),
	MAY(30), 
	JUNE(31),
	JULY(30),
	AUGUST(31),
	SEPTEMBER(30),
	OCTOBER(31),
	NOVENBER(30),
	DECEMBER(31);

	private int days;

	public int getDays() {
		return days;
	}

	Months(int d) {
		this.days = d;
	}

	public static void main(String args[]) {
		for (Months d : Months.values()) {
			System.out.println("number of days");

		}
	}
}
