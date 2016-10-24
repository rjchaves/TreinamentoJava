package br.com.aula3.Exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o peso em gramas");
		
		Material material=new Material(in.nextFloat());
		in.close();
		
		
		while(material.getMassaAtual()>0.5){
			material.decaiMetade();
		}
		System.out.println("Massa inicial: " + material.getMassaInicial());
		System.out.println("Massa final: " + material.getMassaAtual());
		System.out.println(material.getHoras()+":"+material.getMinutos()+":"+material.getSegundos());
	}
}
