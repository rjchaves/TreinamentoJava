package br.com.aula3.exercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		float salario;
		float financiamento;
		
		System.out.println("Digite o salário");
		salario = in.nextFloat();
		
		System.out.println("Digite o valor do financiamento");
		financiamento = in.nextFloat();
		in.close();
		
		if(financiamento<=(5*salario)){
			System.out.println("Financiamento concedido");
		}else{
			System.out.println("Financiamento Negado");
		}
		System.out.println("Obrigado por nos consultar.");
		
	}
}
