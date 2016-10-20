package br.com.aula2.Exercicio2;

public class Lampada {
	private boolean ligada;
	
	public void liga(){
		ligada = true;
	}
	
	public void desliga(){
		ligada = false;
	}
	
	public String observa(){
		if(ligada){
			return "ligada";
		}
		
		return "desligada";
	}
}
