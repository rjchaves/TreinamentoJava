package br.com.aula3.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args){
		int porcX;
		int porcY;
		Scanner in = new Scanner(System.in);
		System.out.println("% de defeito no X");
		porcX = in.nextInt();
		System.out.println("% de defeito no Y");
		porcY = in.nextInt();
		in.close();
		
		Calculo c =  new Calculo(porcX, porcY);
		
		System.out.println("Total carros X com defeito: " + c.totalCarrosXDefeito());
		System.out.println("Total carros Y com defeito: " + c.totalCarrosYDefeito());
		System.out.println("% de carros com defeito: " + c.porcentagemTotalDefeitos());
	}
}
