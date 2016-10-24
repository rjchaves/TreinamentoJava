package br.com.aula3.exercicio10;

import java.util.Scanner;

public class Questionario {
	TesteQuestionario teste;

	public Questionario() {
		teste = new TesteQuestionario();
	}

	public void run() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual � o animal??");

		// Testa a clase animal primeiro
		System.out.println("� um mam�fero?(sim/nao)");
		if (!teste.ehMamifero(in.nextLine())) {
			System.out.println("� uma ave?(sim/nao)");
			teste.ehAve(in.nextLine());
		}

		// Verifica se o animal foi descoberto ap�s cada pergunta
		System.out.println("� quadr�pede?(sim/nao)"); /// Pergunta
		teste.ehQuadrupede(in.nextLine());

		if (teste.animalDescoberto()) { // J� descobriu?
			this.reposta();
		} else {
			System.out.println("� carn�voro?(sim/nao)"); /// Pergunta
			if (!teste.ehCarnivoro(in.nextLine())) {

				System.out.println("� Herbivoro?(sim/nao)"); /// Pergunta
				teste.ehHerbivoro(in.nextLine());
			}

			if (teste.animalDescoberto()) { // J� descobriu?
				this.reposta();
			} else {
				System.out.println("Vive na �gua?(sim/nao)"); /// Pergunta
				if (!teste.viveNaAgua(in.nextLine())) {
					if (teste.animalDescoberto()) { // J� descobriu?
						this.reposta();
					} else {
						System.out.println("Vive em �rvores?(sim/nao)"); /// Pergunta
						teste.viveEmArvores(in.nextLine());
						if (teste.animalDescoberto()) { // J� descobriu?
							this.reposta();
						} else {
							System.out.println("N�o foi poss�vel descobrir");
						}
					}
				}else{
					if (teste.animalDescoberto()) { // J� descobriu?
						this.reposta();
					} else {
						System.out.println("N�o foi poss�vel descobrir");
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
