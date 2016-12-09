package br.com.rjchaves.projetolocadora.troco.unidademonetaria;

public enum EFormatoFisicoUnidadeMonetaria {
	MOEDA ("Moeda(s)"),
	CEDULA ("Cedula(s)");
	
	private String nome;
	private EFormatoFisicoUnidadeMonetaria(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
}
