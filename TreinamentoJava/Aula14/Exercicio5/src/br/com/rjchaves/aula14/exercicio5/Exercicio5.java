package br.com.rjchaves.aula14.exercicio5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			String s1 = input.nextLine();
			String s2 = input.nextLine();
			int valor = s1.compareTo(s2);
			if(valor<0){
				System.out.println("Primeira String menor que a segunda");
			}else if (valor == 0) {
				System.out.println("Primeira String igual a segunda");
			}else{
				System.out.println("Primeira String maior que a segunda");
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
}
