package br.com.aula7.exercicio2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args){
		Ingresso ingresso=null;
		Scanner in = new Scanner(System.in);
		int entrada;
		System.out.println("Digite 1 para ingresso normal ou 2 para VIP");
		entrada = in.nextInt();
		switch (entrada) {
		case 1:
			ingresso = new Normal();
			break;
		case 2:
			System.out.println("Digite 1 para camarote inferior ou 2 para camarote superior");
			entrada = in.nextInt();
			switch (entrada) {
			case 1:
				ingresso = new CamaroteInferior();
				break;
			case 2:
				ingresso = new CamaroteSuperior();
				break;
				
			}
			break;

		}
		in.close();
		
		if(ingresso instanceof Normal){
			System.out.println("Ingresso normal");
			System.out.println(((Normal) ingresso).getValor() + " Reais");
		}
		if(ingresso instanceof Vip){
			if(ingresso instanceof CamaroteSuperior){
				System.out.println("Camarote superior");
				System.out.println(((CamaroteSuperior) ingresso).getValor() + " Reais");
			}else if(ingresso instanceof CamaroteInferior){
				System.out.println("Camarote inferior");
				System.out.println(((CamaroteInferior) ingresso).getValor() + " Reais");
			}
		}
	}

}
