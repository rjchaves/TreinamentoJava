package br.com.rjchaves.aula14.exercicio8.exception;

public class NoLetterException extends Exception {
	public NoLetterException(int indiceCaractere) {
		super("O caractere na posi��o \'"+indiceCaractere+"\' da string n�o � uma letra");
	}
}
