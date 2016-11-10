package br.com.rjchaves.aula14.exercicio8.exception;

public class NoUpperCaseException extends Exception{
	public NoUpperCaseException(int indiceCaractere) {
		super("O caractere na posição \'"+indiceCaractere+"\' da string não é um caractere maiúsculo");
	}
}
