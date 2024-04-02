package com.elcuarzo.web.models;

public class Cat extends Animal implements Mascota{
	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		// TODO Auto-generated method stub
		return "El gato " + getName() + " ronronea.";
	}
}
