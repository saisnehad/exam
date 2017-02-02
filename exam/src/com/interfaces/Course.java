package com.interfaces;

public class Course {
	    String Name;
		int age,id;
		int marks;
}	
	class Student extends Course {
		void age(){
			if(age<25 || age>30){
				System.out.println("register");
			}else{
				System.out.println("don't register");
			}
		}
		class Grade extends Course{
			void marks(){
				if(marks<90){
					System.out.println("pass");
				}else{
					System.out.println("fail");
				}
			}
			
		}
	}

