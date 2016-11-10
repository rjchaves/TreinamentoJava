package br.com.rjchaves.aula14.exercicio7;

public class ProcessadorArgumentos {
	public void imprimeArgs(String args[]) throws MissingArgumentsMainException {
		if(args.length!=4){
			throw new MissingArgumentsMainException(4, args.length);
		}
		for(String a : args){
			System.out.println(a);
		}
	}
}
