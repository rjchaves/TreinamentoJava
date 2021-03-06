package br.com.rjchaves.aula14.exercicio8;

import br.com.rjchaves.aula14.exercicio8.exception.NoLetterException;
import br.com.rjchaves.aula14.exercicio8.exception.NoUpperCaseException;

public class StringProcessor {
	public void isUpperCase(String str) throws NoLetterException, NoUpperCaseException {
		for(int i = 0; i<str.length(); i++){
			if(!Character.isLetter(str.charAt(i))){
				throw new NoLetterException(i);
			}else if(!Character.isUpperCase(str.charAt(i))){
				throw new NoUpperCaseException(i);
			}
		}
	}
}
