package br.com.meta.projetointerface.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.meta.projetointerface.Universidade;
import br.com.meta.projetointerface.excecoes.FuncionarioException;
import br.com.meta.projetointerface.funcionario.professor.Advogado;
import br.com.meta.projetointerface.funcionario.professor.Dentista;
import br.com.meta.projetointerface.interfaces.IProfessor;

public class AdicionarProfessorMenu {
	Universidade universidade;

	public AdicionarProfessorMenu(Universidade universidade) {
		this.universidade = universidade;
	}

	public void run() throws FuncionarioException {
		Scanner input = new Scanner(System.in);
		String entrada;
		System.out.println("Digite o valor da opção desejada\n" 
				+ "1)Adicionar Dentista\n" 
				+ "2)Adicionar Advogado\n"
				+ "0) Cancelar");

		entrada = input.nextLine();

		switch (entrada.charAt(0)) {
		case '1':
			this.adicionarProf(ECategoriaProfessor.DENTISTA);
			break;
		case '2':
			this.adicionarProf(ECategoriaProfessor.ADVOGADO);
			break;
		case '0':
			break;
		default:
			System.out.println("Entrada inválida, nenhuma professor adicionada");
			break;
		}
	}

	private void adicionarProf(ECategoriaProfessor categoriaProfessor) throws FuncionarioException {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Digite a idade do professor");
			int idade = input.nextInt();
			input.nextLine(); /// limpar o buffer

			System.out.println("Digite o nome do professor");
			String nome = input.nextLine();

			System.out.println("Esse professor possui doutorado? (sim/nao)");
			String entrada = input.nextLine();
			char primeiroChar = entrada.charAt(0);
			boolean temDoutorado;

			if (primeiroChar == 's' || primeiroChar == 'S') {
				temDoutorado = true;
			} else if (primeiroChar == 'n' || primeiroChar == 'N') {
				temDoutorado = false;
			} else {
				throw new InputMismatchException();
			}
			universidade.adicionarProfessor(criaProfessor(categoriaProfessor, nome, idade, temDoutorado));

		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida, nenhum professor adicionado");
		}
	}

	private IProfessor criaProfessor(ECategoriaProfessor categoriaProfessor, String nome, int idade,
			boolean temDoutorado) {
		if (categoriaProfessor == ECategoriaProfessor.ADVOGADO) {
			return new Advogado(idade, temDoutorado, nome);
		} else if (categoriaProfessor == ECategoriaProfessor.DENTISTA) {
			return new Dentista(idade, temDoutorado, nome);
		} else {
			return null;
		}
	}
}
