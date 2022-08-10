package com.aurionpro.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.model.Dog;
import com.aurionpro.model.Pet;
import com.aurionpro.model.Animal;
import com.aurionpro.model.Cat;
import com.aurionpro.model.RunImmidiately;

public class AnnotationTest {
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Cat person = new Cat("Tom", 2);
		Dog dog = new Dog("Tommy", 3);

		printDetail(person);
		printDetail(dog);
		
	}

	private static void printDetail(Animal pet) throws IllegalAccessException, InvocationTargetException {
		if (pet.getClass().isAnnotationPresent(Pet.class)) {
			System.out.println("is Pet ");
		} else {
			System.out.println("no pet");
		}

		for (Method method : pet.getClass().getDeclaredMethods()) {
			
			
			if (method.isAnnotationPresent(RunImmidiately.class)) {
				method.invoke(pet);
			}
		}

		for (Method method : pet.getClass().getDeclaredMethods()) {

			if (method.isAnnotationPresent(Pet.class)) {
				Pet annotation = method.getAnnotation(Pet.class);
				for(int i=0; i<annotation.times(); i++) {
					method.invoke(pet);
					
				}
				
			}
		}
	}
}
