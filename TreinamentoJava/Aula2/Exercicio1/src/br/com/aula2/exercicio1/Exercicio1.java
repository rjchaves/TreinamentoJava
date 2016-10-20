package br.com.aula2.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args){
		Pessoa pessoa = new Pessoa();
		Scanner in = new Scanner(System.in);
		System.out.println("Informe os dados");
		
		System.out.println("Nome da pessoa");
		pessoa.setNome(in.nextLine());
		
		System.out.println("Idade da pessoa");
		pessoa.setIdade(in.nextInt());
		
		System.out.println("Digite o numero de aniversários");
		int numeroAniversarios = in.nextInt();
		
		
		for(int i=0; i<numeroAniversarios; i++){
			pessoa.fazAniversario();
		}
		System.out.println(pessoa.retornaNomeIdade());
		
		in.close();
	}
}
