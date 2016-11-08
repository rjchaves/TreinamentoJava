package br.com.aula3.exercicio10;

import java.util.ArrayList;

public class Animal {
	private ArrayList<Caracteristica> caracteristicas;
	private String nome;
	
	public Animal(String nome){
		this.nome = nome;
		this.caracteristicas = new ArrayList<>();
	}
	
	public Animal(String nome, ArrayList<Caracteristica> caracteristicas){
		this.nome = nome;
		this.caracteristicas = caracteristicas;
	}
	
	public ArrayList<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}
	
	public boolean possuiCaracteristica(Caracteristica caracteristica){
		for(Caracteristica c : caracteristicas){
			if(c == caracteristica){
				return true;
			}
		}
		return false;
	}
	
	public String getNome() {
		return nome;
	}
	
	
}
