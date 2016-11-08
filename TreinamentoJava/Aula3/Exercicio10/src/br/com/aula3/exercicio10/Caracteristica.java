package br.com.aula3.exercicio10;

public enum Caracteristica {
	MAMIFERO("Mamifero"),
	AVE("Ave"),
	
	
	QUADRUPEDE("Quadrupede"),
	
	
	CARNIVORO("Carn�voro"),
	HERBIVORO("Herbivoro"),
	
	
	AQUATICO("Aquatico"),
	ARBORICOLA("Arboricola"),
	
	
	REPTIL("Reptil"),
	
	BIPEDE("B�pede"),
	
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
