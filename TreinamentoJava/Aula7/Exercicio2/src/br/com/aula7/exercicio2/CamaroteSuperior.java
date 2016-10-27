package br.com.aula7.exercicio2;

public class CamaroteSuperior extends Vip{
	private int localizacao;

	public int getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(int localizacao) {
		this.localizacao = localizacao;
	}
	
	public double getValor() {
		return (super.getValor()+20);
	}
	
}
