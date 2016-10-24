package br.com.aula3.exercicio10;

import java.util.Scanner;

public class Questionario {
	TesteQuestionario teste;

	public Questionario() {
		teste = new TesteQuestionario();
	}

	public void run() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual é o animal??");

		// Testa a clase animal primeiro
		System.out.println("É um mamífero?(sim/nao)");
		if (!teste.ehMamifero(in.nextLine())) {
			System.out.println("É uma ave?(sim/nao)");
			teste.ehAve(in.nextLine());
		}

		// Verifica se o animal foi descoberto após cada pergunta
		System.out.println("É quadrúpede?(sim/nao)"); /// Pergunta
		teste.ehQuadrupede(in.nextLine());

		if (teste.animalDescoberto()) { // Já descobriu?
			this.reposta();
		} else {
			System.out.println("É carnívoro?(sim/nao)"); /// Pergunta
			if (!teste.ehCarnivoro(in.nextLine())) {

				System.out.println("É Herbivoro?(sim/nao)"); /// Pergunta
				teste.ehHerbivoro(in.nextLine());
			}

			if (teste.animalDescoberto()) { // Já descobriu?
				this.reposta();
			} else {
				System.out.println("Vive na água?(sim/nao)"); /// Pergunta
				if (!teste.viveNaAgua(in.nextLine())) {
					if (teste.animalDescoberto()) { // Já descobriu?
						this.reposta();
					} else {
						System.out.println("Vive em árvores?(sim/nao)"); /// Pergunta
						teste.viveEmArvores(in.nextLine());
						if (teste.animalDescoberto()) { // Já descobriu?
							this.reposta();
						} else {
							System.out.println("Não foi possível descobrir");
						}
					}
				}else{
					if (teste.animalDescoberto()) { // Já descobriu?
						this.reposta();
					} else {
						System.out.println("Não foi possível descobrir");
					}
				}
			}

		}

		in.close();

	}

	private void reposta() {
		System.out.println("O animal escolhido foi " + teste.getAnimalDescoberto());
	}
}
