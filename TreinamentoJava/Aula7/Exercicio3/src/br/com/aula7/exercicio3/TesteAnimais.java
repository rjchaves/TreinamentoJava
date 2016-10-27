package br.com.aula7.exercicio3;

import java.util.ArrayList;

public class TesteAnimais {
	public static void main (String[] args){
		ArrayList<Animal> zoo = new ArrayList<>();
		zoo.add(new Animal("Camelo", "Amarelo", "Terra", 150, 2));
		zoo.add(new Peixe("Tubarão", "Barbatanas e cauda", 300, (float) 1.5));
		zoo.add(new Mamifero("Urso-do-Canadá", "Vermelho", "Mel", 180, (float) 0.5, 4));
		
		System.out.println("---------------------------------------------------");
		for(Animal a : zoo){
			a.dados();
			System.out.println("---------------------------------------------------");
		}
		
	}
}
