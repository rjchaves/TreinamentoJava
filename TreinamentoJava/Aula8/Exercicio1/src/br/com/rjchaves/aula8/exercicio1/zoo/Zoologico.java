package br.com.rjchaves.aula8.exercicio1.zoo;

import java.util.ArrayList;

import javax.management.InstanceNotFoundException;

import br.com.rjchaves.aula8.exercicio1.animal.Anfibio;
import br.com.rjchaves.aula8.exercicio1.animal.Animal;
import br.com.rjchaves.aula8.exercicio1.animal.Ave;
import br.com.rjchaves.aula8.exercicio1.animal.Mamifero;
import br.com.rjchaves.aula8.exercicio1.animal.Peixe;

public class Zoologico {
	private ArrayList<Jaula> jaulas; 
	
	public Zoologico(){
		this.jaulas = new ArrayList<>();
	}
	
	public void adicionaJaula(Jaula jaula){
		this.jaulas.add(jaula);
	}
	
	private void imprimeJaula(Jaula jaula){
		Animal animal = jaula.getAnimal();
		
		if (animal instanceof Peixe){
			((Peixe)animal).nadar();
		}else if (animal instanceof Mamifero){
			((Mamifero)animal).correr();
		}else if (animal instanceof Ave){
			((Ave)animal).voar();
		}else if (animal instanceof Anfibio){
			((Anfibio)animal).Nadar();
		}
	}
	
	public void imprimeZoo(){
		for(Jaula j : jaulas){
			imprimeJaula(j);
		}
	}
}	
