package br.com.aula3.exercicio2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args){
		int totalNumeros;
		int maior=0;
		int menor=0;
		int somatorio=0;
		int numeroLido;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos numeros serão digitados");
		totalNumeros = in.nextInt();
		
		for(int i=0; i<totalNumeros; i++){
			numeroLido = in.nextInt();
			if(i==0){
				maior = numeroLido;
				menor = numeroLido;
			}else{
				if(numeroLido>maior){
					maior =  numeroLido;
				}
				if(numeroLido<menor){
					menor = numeroLido;
				}
			}
			somatorio+=numeroLido;
		}
		in.close();
		
		System.out.println("\nMaior: "+ maior);
		System.out.println("Menor: "+ menor);
		System.out.println("Media: "+ somatorio/totalNumeros);
	}
}
