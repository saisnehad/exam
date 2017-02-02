package com.design;
public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	static{
		singleton = new Singleton();
	}
 public static void main(String args[]){
	 if(singleton==null){
		 singleton = new Singleton();
	 }
 }
}
