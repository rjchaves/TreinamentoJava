package br.com.aula3.Exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<Pessoa> pessoas =  new ArrayList<>();
		char sexo;
		char resposta;
		
		for (int i=0; i<20; i++){
			System.out.println("Digite o sexo (M/F)");
			sexo = in.next().charAt(0);
			System.out.println("Digite a resposta (S/N)");
			resposta = in.next().charAt(0);
			pessoas.add(new Pessoa(sexo, resposta));
		}
		in.close();
		
		new Pesquisa(pessoas).processa();
		
	}
}
