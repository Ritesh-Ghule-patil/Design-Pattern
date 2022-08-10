package com.aurionpro.model;
@Pet
public class Dog implements Animal{

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@RunImmidiately
	public void speak() {
		System.out.println(this.name+ "  is barking...");
	}
	
}
