package br.com.aula1.exercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Candidato candidato = new Candidato();
		System.out.println("Digite os dados do candidato");
		
		System.out.println("Codigo");
		candidato.setCodigo(scanner.nextInt());
		
		System.out.println("Ano do nascimento");
		candidato.setAnoNascimento(scanner.nextInt());
		
		System.out.println("Nota na primeira fase");
		candidato.setPrimeiraNota(scanner.nextFloat());
		
		System.out.println("Numero de horas de qualificação");
		candidato.setHorasQualificação(scanner.nextInt());
		
		System.out.println("Meses de experiência");
		candidato.setMesesExperiencia(scanner.nextInt());
		scanner.close();
		
		
		//Mostra
		System.out.println("Código: " + candidato.getCodigo());
		System.out.println("Idade: "+ candidato.getIdade());
		
		if(candidato.verificarAprovacao()){
			System.out.println("Aprovado para a terceira etapa");
		}else{
			System.out.println("Reprovado");
		}
		
	}
}
