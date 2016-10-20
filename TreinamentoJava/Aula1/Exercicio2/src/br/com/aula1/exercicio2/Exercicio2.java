package br.com.aula1.exercicio2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Compra compra =  new Compra();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira quantidade de litros de gasolina");
		compra.setLitrosGasolina(scanner.nextFloat());
		
		System.out.println("Insira quantidade de litros de Alcool");
		compra.setLitrosAlcool(scanner.nextFloat());
		scanner.close();
		
		System.out.println("Valor a ser pago:" + compra.getValorCompra());
	}
}
