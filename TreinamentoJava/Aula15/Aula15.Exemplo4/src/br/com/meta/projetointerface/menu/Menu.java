package br.com.meta.projetointerface.menu;

import java.util.Scanner;

import br.com.meta.projetointerface.Universidade;
import br.com.meta.projetointerface.excecoes.FuncionarioException;
import br.com.meta.projetointerface.funcionario.administrativo.FaxineiraCiaDasDiaristas;
import br.com.meta.projetointerface.funcionario.administrativo.FaxineiraSulClean;
import br.com.meta.projetointerface.funcionario.administrativo.Jardineiro;

public class Menu {
	Universidade universidade;
	AdicionarProfessorMenu menuProfessor;
	AdministrarAlunosMenu menuAlunos;
	
	public Menu() {
		universidade = new Universidade();
		menuProfessor = new AdicionarProfessorMenu(universidade);
		menuAlunos = new AdministrarAlunosMenu(universidade);
	}
	
	public void run() throws FuncionarioException {
		Scanner input = new Scanner(System.in);
		String entrada;
		
		
		do{
			System.out.println("Digite o valor da opção desejada\n"
					+ "1)Definir nome da universidade\n"
					+ "2)Adicionar Jardineiro\n"
					+ "3)Definir faxineira\n"
					+ "4)Adicionar professor\n"
					+ "5)Realizar limpeza\n"
					+ "6)Listar professores\n"
					+ "7)Gerenciar alunos\n"
					+ "0)Sair");
			entrada = input.nextLine();
			switch (entrada.charAt(0)) {
			case '1':
				this.alterarNomeUniversidade();
				break;
			case '2':
				universidade.setJardineiro(new Jardineiro());
				System.out.println("Jardineiro adicionado");
				break;
			case '3':
				this.definirFaxineira();
				break;
			case '4':
				menuProfessor.run();
				break;
			case '5':
				universidade.diaDaLimpeza();
				break;
			case '6':
				universidade.listarProfessores();
				break;
			case '7':
				menuAlunos.run();
				break;
			case '0':
				break;
			default:
				System.out.println("Entrada inválida");
				break;
			}
			
		}while(entrada.charAt(0) != '0');
		
	}
	
	private void alterarNomeUniversidade(){
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o novo nome da universidade");
		universidade.alterarNome(input.nextLine());
	}
	
	
	private void definirFaxineira() throws FuncionarioException{
		Scanner input = new Scanner(System.in);
		String entrada;
		System.out.println("Digite"
				+ "1) Para faxineira companhia das diaristas\n"
				+ "2) Para faxineira sul clean\n");
		entrada=input.nextLine();
		switch (entrada.charAt(0)) {
		case '1':
			universidade.setFaxineira(new FaxineiraCiaDasDiaristas());
			break;
		case '2':
			universidade.setFaxineira(new FaxineiraSulClean());
			break;
		default:
			System.out.println("Entrada inválida, nenhuma faxineira adicionada");
			break;
		}
	}
	
}
