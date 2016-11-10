package br.com.rjchaves.aula14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2e3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean continua = false;
		do{
			System.out.println("Digite dois numeros para dividir o primeiro pelo segundo");
			try{
				System.out.println(Aritmetica.dividir(input.nextInt(), input.nextInt()));
				continua=false;
			}catch (ArithmeticException e) {
				System.out.println("O segundo valor não pode ser zero");
				continua=true;
			}catch (InputMismatchException e) {
				System.out.println("Apenas valores numericos são permitidos");
				//limpa o buffer
				input.nextLine();
				continua=true;
			}
		}while(continua);
		input.close();
	}
}
