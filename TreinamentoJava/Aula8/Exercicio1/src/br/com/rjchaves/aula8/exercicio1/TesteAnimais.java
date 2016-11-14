package br.com.rjchaves.aula8.exercicio1;

import java.util.Scanner;

import br.com.rjchaves.aula8.exercicio1.animal.Anfibio;
import br.com.rjchaves.aula8.exercicio1.animal.Ave;
import br.com.rjchaves.aula8.exercicio1.animal.Mamifero;
import br.com.rjchaves.aula8.exercicio1.animal.Peixe;
import br.com.rjchaves.aula8.exercicio1.zoo.Jaula;
import br.com.rjchaves.aula8.exercicio1.zoo.Zoologico;

public class TesteAnimais {
	public void run(){
		Zoologico zoo =  new Zoologico();
		
		int entrada;
		Scanner in = new Scanner(System.in);
		do{
			System.out.println("Digite a opção desejada");
			System.out.println("1) Inserir Peixe");
			System.out.println("2) Inserir Mamífero");
			System.out.println("3) Inserir Ave");
			System.out.println("4) Inserir Anfibio");
			System.out.println("0) Sair");
			entrada = in.nextInt();
			
			in.nextLine();///Limpar o buffer do teclado
			
			switch (entrada) {
			case 1:
				zoo.adicionaJaula(new Jaula(this.inserirPeixe()));
				break;
			case 2:
				zoo.adicionaJaula(new Jaula(this.inserirMamifero()));
				break;
			case 3:
				zoo.adicionaJaula(new Jaula(this.inserirAve()));
				break;
			case 4:
				zoo.adicionaJaula(new Jaula(this.inserirAnfibio()));
				break;
				
			default:
				break;
			}
			
		}while(entrada!=0);
		zoo.imprimeZoo();
		System.out.println("Saindo");
		in.close();
	}
	
	private Peixe inserirPeixe(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira nome do peixe");
		String nome=in.nextLine();
		System.out.println("Insira a caracteristica do peixe");
		String caracteristica=in.nextLine();
		System.out.println("Insira o comprimento do peixe");
		float comprimento = in.nextFloat();
		in.nextLine();///Limpar o buffer do teclado
		
		System.out.println("Insira a velocidade do peixe");
		float velocidade = in.nextFloat();
		in.nextLine();///Limpar o buffer do teclado
		
		System.out.println("Insira o som do peixe");
		String som = in.nextLine();
		
		return new Peixe(nome, caracteristica, comprimento, velocidade, som);
	}
	
	private Ave inserirAve(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira nome da ave");
		String nome=in.nextLine();
		System.out.println("Insira a caracteristica da ave");
		String caracteristica=in.nextLine();
		System.out.println("Insira o comprimento da ave");
		float comprimento = in.nextFloat();
		in.nextLine();///Limpar o buffer do teclado
		
		System.out.println("Insira a velocidade da ave");
		float velocidade = in.nextFloat();
		in.nextLine();///Limpar o buffer do teclado
		
		System.out.println("Insira o som da ave");
		String som = in.nextLine();
		
		return new Ave(nome, caracteristica, comprimento, velocidade, som);
	}
	
	private Mamifero inserirMamifero(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira nome do mamifero");
		String nome=in.nextLine();
		System.out.println("Insira a cor do mamifero");
		String cor=in.nextLine();
		
		System.out.println("Insira o alimento do mamifero");
		String alimento=in.nextLine();
		
		System.out.println("Insira o comprimento do mamifero");
		float comprimento = in.nextFloat();
		in.nextLine();///Limpar o buffer do teclado
		
		System.out.println("Insira a velocidade do mamifero");
		float velocidade = in.nextFloat();
		in.nextLine();///Limpar o buffer do teclado
		
		System.out.println("Insira a quantidade de patas do mamifero");
		int patas = in.nextInt();
		
		in.nextLine();///Limpar o buffer do teclado
		
		System.out.println("Insira o som do mamifero");
		String som = in.nextLine();
		
		return new Mamifero(nome, cor, alimento, comprimento, velocidade, patas, som);
	}
	
	private Anfibio inserirAnfibio(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira nome do Anfibio");
		String nome=in.nextLine();

		
		System.out.println("Insira o comprimento do Anfibio");
		float comprimento = in.nextFloat();
		in.nextLine();///Limpar o buffer do teclado
		
		System.out.println("Insira a velocidade do Anfibio");
		float velocidade = in.nextFloat();
		in.nextLine();///Limpar o buffer do teclado
		
		System.out.println("Insira a quantidade de patas do Anfibio");
		int patas = in.nextInt();
		
		in.nextLine();///Limpar o buffer do teclado
		
		System.out.println("Insira o som do Anfibio");
		String som = in.nextLine();
		
		return new Anfibio(nome, comprimento, velocidade, patas, som);
	}
}
