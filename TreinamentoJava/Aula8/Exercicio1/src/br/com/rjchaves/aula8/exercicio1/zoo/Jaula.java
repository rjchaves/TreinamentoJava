package br.com.rjchaves.aula8.exercicio1.zoo;

import br.com.rjchaves.aula8.exercicio1.animal.Animal;

public class Jaula {
	private Animal animal;
	
	

	public Jaula(Animal animal) {
		this.animal = animal;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
}
