package com.syntax.class12;

public class Dog {
	
	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	void bark() {
		System.out.println("Dog can bark");
	}
	
	void sleep() {
		System.out.println("Dog can sleep");
	}
	
	public static void main (String []args) {
		
		Dog dog1=new Dog();
		dog1.name = "Jemes";
		dog1.breed = "poodel";
		dog1.color = "white";
		dog1.age = 11;
		dog1.height = 2.4;
		dog1.gender ='M';
		
		dog1.bark();
		dog1.sleep();
		
		Dog dog2 = new Dog();
		dog2.name = "Bongo";
		dog2.breed= "bulldog";
		dog2.color ="black";
		dog2.age=5;
		dog2.height = 1.1;
		dog2.gender = 'M';
		
		dog2.sleep();
		
	}

}
