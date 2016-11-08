package br.com.aula3.exercicio10;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;

public class Questionario {

	private Animais animais;

	public Questionario() {
		animais = new Animais();
	}

	public void run() {
		Scanner in = new Scanner(System.in);
		String entrada;
		System.out.println("Qual é o animal??");
		for (Caracteristica c : Caracteristica.values()) {
			do {
				System.out.println("O animal é " + c.getNome() + "?(S/N)");
				entrada = in.nextLine();
				if (entrada.charAt(0) == 's' || entrada.charAt(0) == 'S') {
					animais.possuiCaracteristica(c);
				} else if (entrada.charAt(0) == 'n' || entrada.charAt(0) == 'N') {
					animais.naoPossuiCaracteristica(c);
				} else {
					System.out.println("Opção inválida");
				}
			} while (!(entrada.charAt(0) == 's' || entrada.charAt(0) == 'S')
					&& !(entrada.charAt(0) == 'n' || entrada.charAt(0) == 'N'));

			if (animais.ultimoAnimal()) {
				if (animais.getAnimalFinal() != null) {
					System.out.println("O Animal é " + animais.getAnimalFinal().getNome());
				} else {
					System.out.println("O Animal não existe na lista");
				}
				break;
			}
		}
	}

}
