package br.com.rjchaves.aula14.exercicio8.exception;

public class NoUpperCaseException extends Exception{
	public NoUpperCaseException(int indiceCaractere) {
		super("O caractere na posi��o \'"+indiceCaractere+"\' da string n�o � um caractere mai�sculo");
	}
}
