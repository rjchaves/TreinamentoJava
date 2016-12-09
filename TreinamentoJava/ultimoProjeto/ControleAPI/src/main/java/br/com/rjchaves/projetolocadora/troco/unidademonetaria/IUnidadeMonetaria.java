package br.com.rjchaves.projetolocadora.troco.unidademonetaria;

public interface IUnidadeMonetaria {
	public int getValorUnidadeMonetaria();
	
	public String getNomeUnidadeMonetaria();
	
	public ETipoUnidadeMonetaria getTipoUnidadeMonetaria();
	
	public EFormatoFisicoUnidadeMonetaria getFormatoFisicoUnidadeMonetaria();
}
