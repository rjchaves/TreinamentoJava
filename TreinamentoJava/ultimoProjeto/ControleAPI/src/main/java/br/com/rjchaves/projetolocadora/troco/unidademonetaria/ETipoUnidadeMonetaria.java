package br.com.rjchaves.projetolocadora.troco.unidademonetaria;

public enum ETipoUnidadeMonetaria {
	CENTAVO ("Centavos"),
	REAL ("Reais");
	
	private String nome;
	private ETipoUnidadeMonetaria(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
}
