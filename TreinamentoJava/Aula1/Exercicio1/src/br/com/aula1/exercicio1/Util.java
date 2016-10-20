package br.com.aula1.exercicio1;

import java.util.Calendar;

public class Util {
	public static int getAnoAtual(){
		Calendar cal = Calendar.getInstance();		
		return cal.get(Calendar.YEAR);
	}
}
