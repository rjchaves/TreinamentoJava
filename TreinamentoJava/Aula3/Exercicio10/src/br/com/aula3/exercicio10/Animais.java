package br.com.aula3.exercicio10;

import java.util.ArrayList;

public class Animais {
	private ArrayList<Animal> animais;
	
	
	public Animais(){
		this.animais = new ArrayList<>();
		
		ArrayList<Caracteristica> caracteristicas;
		Animal animal;

		// leão
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.CARNIVORO);
		caracteristicas.add(Caracteristica.MAMIFERO);
		caracteristicas.add(Caracteristica.QUADRUPEDE);
		caracteristicas.add(Caracteristica.TERRESTRE);
		animal = new Animal("leão", caracteristicas);
		animais.add(animal);

		// cavalo
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.HERBIVORO);
		caracteristicas.add(Caracteristica.MAMIFERO);
		caracteristicas.add(Caracteristica.QUADRUPEDE);
		caracteristicas.add(Caracteristica.TERRESTRE);
		animal = new Animal("cavalo", caracteristicas);
		animais.add(animal);
		
		// homem
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.BIPEDE);
		caracteristicas.add(Caracteristica.ONIVORO);
		caracteristicas.add(Caracteristica.TERRESTRE);
		caracteristicas.add(Caracteristica.MAMIFERO);
		animal = new Animal("homem", caracteristicas);
		animais.add(animal);
		
		// macaco
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.QUADRUPEDE);
		caracteristicas.add(Caracteristica.ARBORICOLA);
		caracteristicas.add(Caracteristica.MAMIFERO);
		caracteristicas.add(Caracteristica.HERBIVORO);
		animal = new Animal("macaco", caracteristicas);
		animais.add(animal);
		
		// avestruz
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.BIPEDE);
		caracteristicas.add(Caracteristica.AVE);
		caracteristicas.add(Caracteristica.TERRESTRE);
		caracteristicas.add(Caracteristica.HERBIVORO);
		animal = new Animal("avestruz", caracteristicas);
		animais.add(animal);
		
		// pinguim
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.BIPEDE);
		caracteristicas.add(Caracteristica.AQUATICO);
		caracteristicas.add(Caracteristica.TERRESTRE);
		caracteristicas.add(Caracteristica.CARNIVORO);
		caracteristicas.add(Caracteristica.AVE);
		animal = new Animal("pinguim", caracteristicas);
		animais.add(animal);
		
		// pato
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.BIPEDE);
		caracteristicas.add(Caracteristica.AQUATICO);
		caracteristicas.add(Caracteristica.TERRESTRE);
		caracteristicas.add(Caracteristica.HERBIVORO);
		caracteristicas.add(Caracteristica.AVE);
		animal = new Animal("pato", caracteristicas);
		animais.add(animal);
		
		// aguia
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.BIPEDE);
		caracteristicas.add(Caracteristica.AVE);
		caracteristicas.add(Caracteristica.CARNIVORO);
		animal = new Animal("aguia", caracteristicas);
		animais.add(animal);
		
		// tartaruga
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.REPTIL);
		caracteristicas.add(Caracteristica.AQUATICO);
		caracteristicas.add(Caracteristica.TERRESTRE);
		caracteristicas.add(Caracteristica.HERBIVORO);
		caracteristicas.add(Caracteristica.QUADRUPEDE);
		animal = new Animal("tartaruga", caracteristicas);
		animais.add(animal);
		
		// crocodilo
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.REPTIL);
		caracteristicas.add(Caracteristica.AQUATICO);
		caracteristicas.add(Caracteristica.TERRESTRE);
		caracteristicas.add(Caracteristica.CARNIVORO);
		caracteristicas.add(Caracteristica.QUADRUPEDE);
		animal = new Animal("crocodilo", caracteristicas);
		animais.add(animal);
		
		// cobra
		caracteristicas = new ArrayList<>();
		caracteristicas.add(Caracteristica.REPTIL);
		caracteristicas.add(Caracteristica.TERRESTRE);
		caracteristicas.add(Caracteristica.CARNIVORO);
		animal = new Animal("cobra", caracteristicas);
		animais.add(animal);

	}
	
	public void possuiCaracteristica(Caracteristica caracteristica){
		for(int i=0; i<animais.size();i++){
			if(!animais.get(i).possuiCaracteristica(caracteristica)){
				animais.remove(i);
				i--;
			}
		}
	}
	
	public void naoPossuiCaracteristica(Caracteristica caracteristica){
		for(int i=0; i<animais.size();i++){
			if(animais.get(i).possuiCaracteristica(caracteristica)){
				animais.remove(i);
				i--;
			}
		}
	}
	
	public boolean ultimoAnimal(){
		return(animais.size()<=1);
	}
	
	public Animal getAnimalFinal(){
		if(animais.size()==1){
			return animais.get(0);
		}else{
			return null;
		}
	}
	
}
