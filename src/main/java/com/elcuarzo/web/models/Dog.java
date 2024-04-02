package com.elcuarzo.web.models;

public class Dog extends Animal implements Mascota{
	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		// TODO Auto-generated method stub
		if(getWeight() < 10) {
			return "El perro " + getName() + " salta de alegria.";
		} else {
			return "El perro " + getName() + " te mueve la cola.";
		}
	}
}
