package br.com.aula7.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Imovel imovel=null;
		int entrada;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Digite 1 para imovel novo 2 para imovel Velho");
			entrada = in.nextInt();
			//Limpar o buffer
			in.nextLine();
			switch (entrada) {
			case 1:
				imovel = new Novo();
				break;
			case 2:
				imovel = new Velho();
				break;

			default:
				System.out.println("Entrada invalida");
				break;
			}
		} while (entrada < 1 && entrada > 2);
		
		
		System.out.println("Digite o endereco do imovel");
		imovel.setEndereco(in.nextLine());
		
		System.out.println("Digite o preco do imovel");
		imovel.setPreco(in.nextDouble());
		in.close();
		imovel.imprimir();
	}
}

