package br.com.meta.projetointerface.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.meta.projetointerface.Universidade;
import br.com.meta.projetointerface.aluno.Aluno;
import br.com.meta.projetointerface.excecoes.AlunoException;

public class AdministrarAlunosMenu {
	Universidade universidade;

	public AdministrarAlunosMenu(Universidade universidade) {
		this.universidade = universidade;
	}

	public void run() {
		Scanner input = new Scanner(System.in);
		String entrada;

		do {
			System.out.println("Digite o valor da opção desejada\n" 
					+ "1)Listar Alunos\n" 
					+ "2)Adicionar Aluno\n"
					+ "3)Excluir aluno\n" 
					+ "0)Sair");
			entrada = input.nextLine();
			switch (entrada.charAt(0)) {
			case '1':
				universidade.listarAlunos();
				break;
			case '2':
				this.adicionarAluno();
				break;
			case '3':
				this.excluirAluno();
				break;
			case '0':
				break;
			default:
				System.out.println("Entrada inválida");
				break;
			}

		} while (entrada.charAt(0) != '0');
	}

	private void adicionarAluno() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite os dados do aluno");

		System.out.println("Nome");
		String nome = input.nextLine();

		System.out.println("E-mail");
		String email = input.nextLine();

		System.out.println("Endereço");
		String endereco = input.nextLine();

		System.out.println("Bairro");
		String bairro = input.nextLine();

		System.out.println("Cidade");
		String cidade = input.nextLine();

		System.out.println("Cep");
		String cep = input.nextLine();

		System.out.println("Estado");
		String estado = input.nextLine();

		System.out.println("Pais");
		String pais = input.nextLine();

		System.out.println("Telefone");
		String telefone = input.nextLine();

		try {
			Aluno aluno = new Aluno(nome, email, endereco, bairro, cidade, cep, estado, pais, telefone);
			universidade.adicionarAluno(aluno);
			System.out.println("Aluno adicionado com sucesso");
		} catch (AlunoException e) {
			System.out.println(e.getMessage());
			System.out.println("Aluno não foi inserido");
		}
	}

	private void excluirAluno() {
		Scanner input = new Scanner(System.in);
		int indiceAluno;
		System.out.println("Digite o indice do aluno a ser excluido");
		try {
			indiceAluno = input.nextInt();

			universidade.excluirAluno(indiceAluno);
			System.out.println("Aluno excluido com sucesso");
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
		} catch (AlunoException e) {
			System.out.println(e.getMessage());
		}

	}
}
