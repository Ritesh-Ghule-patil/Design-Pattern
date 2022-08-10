package com.aurionpro.model;

@Pet
public class Cat implements Animal{

	private String name;
	private int age;
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@RunImmidiately
	public void speak() {
		System.out.println(this.name +" speak Meoww...");
		System.out.println();
	}
	
	@Pet(times=3)
	public void eat() {
		System.out.println(this.name +" eat's....");
	}
	
	public void sleep() {
		System.out.println(this.name +" is Sleeping...");
	}

}
