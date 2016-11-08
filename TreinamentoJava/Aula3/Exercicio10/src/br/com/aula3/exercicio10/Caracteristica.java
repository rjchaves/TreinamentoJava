package br.com.aula3.exercicio10;

public enum Caracteristica {
	MAMIFERO("Mamifero"),
	AVE("Ave"),
	
	
	QUADRUPEDE("Quadrupede"),
	
	
	CARNIVORO("Carnívoro"),
	HERBIVORO("Herbivoro"),
	
	
	AQUATICO("Aquatico"),
	ARBORICOLA("Arboricola"),
	
	
	REPTIL("Reptil"),
	
	BIPEDE("Bípede"),
	
	ONIVORO("Onivoro"),
	
	TERRESTRE("Terrestre");
	
	private final String nome; 
	
	private Caracteristica(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
