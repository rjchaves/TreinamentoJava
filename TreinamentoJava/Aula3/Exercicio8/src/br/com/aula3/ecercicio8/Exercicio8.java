package br.com.aula3.ecercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Informe o ano");
		int ano =  in.nextInt();
		in.close();
		
		if( ((ano%400)==0 || (ano%4)==0)  && ano%100!=0 ){
			System.out.println("É Bissexto");
		}else{
			System.out.println("Não é Bissexto");
		}
	}
}
