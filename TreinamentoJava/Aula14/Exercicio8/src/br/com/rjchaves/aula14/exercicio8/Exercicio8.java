package br.com.rjchaves.aula14.exercicio8;

import java.util.Scanner;

import br.com.rjchaves.aula14.exercicio8.exception.NoLetterException;
import br.com.rjchaves.aula14.exercicio8.exception.NoUpperCaseException;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String entrada = input.nextLine();
		
		try {
			new StringProcessor().isUpperCase(entrada);
		} catch (NoLetterException e) {
			System.out.println(e.getMessage());
		} catch (NoUpperCaseException e) {
			System.out.println(e.getMessage());
		}
	}
}
