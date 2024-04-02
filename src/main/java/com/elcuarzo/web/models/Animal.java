package com.elcuarzo.web.models;

public class Animal {
	String name;
	String breed;
	double weight;
	
	public Animal(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
}
