package br.com.rjchaves.aula14.exercicio7;

public class Exercicio7 {
	public static void main(String[] args) {
		try {
			new ProcessadorArgumentos().imprimeArgs(args);
		} catch (MissingArgumentsMainException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
