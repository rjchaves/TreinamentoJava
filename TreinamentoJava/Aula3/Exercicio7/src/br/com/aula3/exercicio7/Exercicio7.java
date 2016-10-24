package br.com.aula3.exercicio7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		for(float i=50; i<=150; i+=2){
			System.out.println( i +"="+ Fahrenheit.getCentigrados(i));
		}
		
	}
}
