package br.com.rjchaves.aula14.exercicio7;

public class MissingArgumentsMainException extends Exception {
	public MissingArgumentsMainException(int minimo, int valoresPassados) {
		super("Numero de argumentos incorretos Minimo \'"+minimo+"\' Passados \'"+valoresPassados+"\'");
	}
}
